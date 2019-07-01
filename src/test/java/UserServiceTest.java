
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class UserServiceTest {
    @Test
    public void testService(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService=(UserService) applicationContext.getBean("userService");
        userService.save();
    }
}
