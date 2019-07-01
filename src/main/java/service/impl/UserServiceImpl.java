package service.impl;

import com.xianzhi945.learning.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    /*@Autowired
    @Qualifier("userDAO")
    */
    @Resource(name="userDAO")
    private UserDao userDao;
    @Override
    public void save() {
        System.out.println("ServiceImpl执行");
        userDao.save();
    }
}
