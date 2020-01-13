package com.ujiuye.springbootmybatis01.controller;

import com.ujiuye.springbootmybatis01.dao.UserDao;
import com.ujiuye.springbootmybatis01.pojo.User;
import com.ujiuye.springbootmybatis01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /***
     * 获取全部用户信息
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    /***
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping("/")
    public String createUser(User user) {
        userService.createUser(user);
        return "success";
    }

    //获取指定id用户信息
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id){
        return userService.getUser(id);
    }

    /**
     * 更新指定id用户信息
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Long id,User user) {
        userService.updateUser(id, user);
        return "success";
    }

    /***
     * 删除指定id用户
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {

        userService.deleteUser(id);
        return "success";

    }

}
