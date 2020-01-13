package com.ujiuye.springbootmybatis01.service.impl;

import com.ujiuye.springbootmybatis01.dao.UserDao;
import com.ujiuye.springbootmybatis01.pojo.User;
import com.ujiuye.springbootmybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> getUserList() {
        return userDao.getAll();
    }

    @Override
    public void createUser(User user) {
        userDao.save(user);

    }

    @Override
    public User getUser(Long id) {
        return userDao.findone(id);
    }

    @Override
    public void updateUser(Long id, User user) {
        user.setId(id);
        userDao.update(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}
