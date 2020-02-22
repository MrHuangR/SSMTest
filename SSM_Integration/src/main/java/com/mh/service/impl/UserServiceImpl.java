package com.mh.service.impl;

import com.mh.dao.IUserDao;
import com.mh.domain.User;
import com.mh.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public List<User> findAll() {
        System.out.println("业务层");
        List<User> users = userDao.findAll();
        return users;
    }

    @Override
    public void saveUser(User user) {
        System.out.println("业务层的saveUser");
        userDao.saveUser(user);
    }
}
