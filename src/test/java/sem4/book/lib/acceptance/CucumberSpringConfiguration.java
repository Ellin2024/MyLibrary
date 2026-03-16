package sem4.book.lib.acceptance;

import org.springframework.boot.test.context.SpringBootTest;

import io.cucumber.spring.CucumberContextConfiguration;
import sem4.book.lib.MylibraryApplication;



@CucumberContextConfiguration
@SpringBootTest(classes = MylibraryApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class CucumberSpringConfiguration 
{

}
