import OtherAnnotation.CustomerService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OtherAnnotationTest {

    @Test
    public void testOther(){
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService=(CustomerService) applicationContext.getBean("customerService");
        customerService.save();
        // applicationContext.close();
    }
}
