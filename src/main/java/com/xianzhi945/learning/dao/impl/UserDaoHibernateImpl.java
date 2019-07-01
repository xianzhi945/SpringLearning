package com.xianzhi945.learning.dao.impl;

import com.xianzhi945.learning.dao.UserDao;

public class UserDaoHibernateImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("使用Hinbernate实现UserDao");
    }
}
