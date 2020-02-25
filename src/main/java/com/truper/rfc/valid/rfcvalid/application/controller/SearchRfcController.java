package com.truper.rfc.valid.rfcvalid.application.controller;

import com.truper.rfc.valid.rfcvalid.application.dto.ValidRFCDto;
import com.truper.rfc.valid.rfcvalid.domain.repository.RfcRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/search")
public class SearchRfcController {

    @Autowired
    private RfcRepository rfcRepository;



    @GetMapping("/{search}")
    public ValidRFCDto searchRfc(@PathVariable String search) {
        return new ValidRFCDto( rfcRepository.findById(search).isPresent() ? Boolean.TRUE : Boolean.FALSE);
    }


}
