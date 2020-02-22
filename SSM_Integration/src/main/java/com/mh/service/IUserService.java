package com.mh.service;

import com.mh.domain.User;

import java.util.List;

public interface IUserService {
    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);
}
