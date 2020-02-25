package com.truper.rfc.valid.rfcvalid.application.serviceImpl;

import com.truper.rfc.valid.rfcvalid.domain.entity.Rfc;
import com.truper.rfc.valid.rfcvalid.domain.repository.RfcRepository;
import com.truper.rfc.valid.rfcvalid.domain.service.RFCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class RFCServiceImpl implements RFCService {

    private static final String SEPARATOR = "\\|";

    @Autowired
    private RfcRepository rfcRepository;

    @Value("${rfc.path.charge}")
    private String PATH;

    @Value("${rfc.path.iso}")
    private String ISO;


    @Value("${rfc.text.charge}")
    private String CHARGE;

    @Override
    public String rfcCharge() {
        Rfc rfc;
        rfc = new Rfc("GOPM840323T14", Boolean.FALSE);
        rfcRepository.save(rfc);
//        BufferedReader bufferedReader = null;
//                BigInteger c = BigInteger.valueOf(0);
//        try {
//            File archivo = new File(PATH);
//            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(archivo), ISO));
//            String linea;
//            linea = bufferedReader.readLine();
//            linea = bufferedReader.readLine();
//            while ((linea = bufferedReader.readLine()) != null) {
//                String[] cadenas = linea.split(SEPARATOR);
//                rfc = new Rfc(cadenas[0], Boolean.FALSE);
//                rfcRepository.save(rfc);
//                c = c.add(BigInteger.ONE);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                bufferedReader.close();
//            } catch (IOException e) {
//                return "error";
//            }
//        }

        return CHARGE ;
    }
}


