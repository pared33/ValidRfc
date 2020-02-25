package com.truper.rfc.valid.rfcvalid.application.controller;

import com.truper.rfc.valid.rfcvalid.domain.service.RFCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rfc")
public class RfcController {

    @Autowired
    private RFCService rfcService;

    @GetMapping("/charge")
    public String chargeRfc() {
        return rfcService.rfcCharge();
    }

}
