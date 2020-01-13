package com.ujiuye.springbootmybatis01.dao;

import com.ujiuye.springbootmybatis01.pojo.User;

import java.util.List;

public interface UserDao {
    public List<User> getAll();
    public User findone(Long id);
    public void save(User user);
    public void update(User user);
    public void delete(Long id);

}
