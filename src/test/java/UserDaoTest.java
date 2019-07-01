import com.xianzhi945.learning.dao.UserDao;
import com.xianzhi945.learning.dao.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    @Test
    public void demo1(){
        UserDao userDao=new UserDaoImpl();
        ((UserDaoImpl) userDao).setName("123");
        userDao.save();
        System.out.println("传统方式执行");
    }
    @Test
    public void demo2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) applicationContext.getBean("userDAO");
        userDao.save();
        System.out.println("利用Spring执行");

    }
}
