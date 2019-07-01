import SpringAOPAnno.OrderDao;
import SpringAopLearning.ProductDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContextAOPAnno.xml")
public class SpringAopAnnoTest {
    @Resource(name="orderDao")
    private OrderDao orderDao;
    @Test
    public void test(){
        orderDao.save();
        orderDao.delete();
        orderDao.update();
        orderDao.find();
    }
}
