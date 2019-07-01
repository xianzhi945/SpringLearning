package com.xianzhi945.learning.dao.impl;

import com.xianzhi945.learning.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

//@Component("userDAO")//相当于<bean id="userDao" class="UserDaoImpl>
@Repository("userDAO")
public class UserDaoImpl implements UserDao {

    @Value("王东")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("UserDaoImpl已经执行"+name);
    }
}
