package wallet.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import wallet.CouponApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CouponApplication.class })
public class CucumberSpingConfiguration {}
