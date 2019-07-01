import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xmlAnnotation.orderService;

public class XMLAnnotationTest {
    @Test
    public void test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContextForxmlAndAnnotation.xml");
        orderService order=(orderService) applicationContext.getBean("orderService");
        order.save();
    }
}
