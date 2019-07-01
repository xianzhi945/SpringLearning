package xmlAnnotation;

import javax.annotation.Resource;

public class orderService {

    @Resource(name="OrderDao")
    private orderDAO orderDao;
    @Resource(name="userDao")
    private userDAO userDao;
    public void save(){
        orderDao.save();
        userDao.save();
        System.out.println("orderService执行了");
    }
}
