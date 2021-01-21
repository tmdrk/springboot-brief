package org.tmdrk.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.tmdrk.boot.validated.ModelValidateUtil;
import org.tmdrk.boot.validated.ValidateTest;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootApplicationTests {

    @Test
    public void contextLoads() {
        ValidateTest validateTest = new ValidateTest();
        try {
            ModelValidateUtil.validate(validateTest);
        }catch (Exception e){
            e.printStackTrace();
        }
        validateTest.setId(1L);
        validateTest.setAge("12");
        validateTest.setName("zhou");
        System.out.println(ModelValidateUtil.validate(validateTest));
    }

}
