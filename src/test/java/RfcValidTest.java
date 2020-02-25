import com.truper.rfc.valid.rfcvalid.RfcvalidApplication;
import com.truper.rfc.valid.rfcvalid.domain.repository.RfcRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RfcvalidApplication.class)
@ActiveProfiles("dev")
public class RfcValidTest {

    @Autowired
    private RfcRepository rfcService;

    @Test
    public void newReceiver() {
        assertNotNull( rfcService.findById("VADA940216BY9"));
    }
}
