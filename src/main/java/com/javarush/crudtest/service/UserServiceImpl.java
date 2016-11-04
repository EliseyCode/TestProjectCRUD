package com.javarush.crudtest.service;

import com.javarush.crudtest.dao.UserDao;
import com.javarush.crudtest.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void removeUser(int id) {
        userDao.removeUser(id);
    }

    @Override
    @Transactional
    public User getUser(int id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public List<User> getUsers(Long page) {
        return userDao.getUsers(page);
    }

    @Override
    @Transactional
    public List<User> getUsers(String name) {
        return userDao.getUsers(name);
    }

    @Override
    @Transactional
    public List<User> getUsers(int age) {
        return userDao.getUsers(age);
    }

    @Override
    @Transactional
    public List<User> getUsers(Date dateCreated) {
        return userDao.getUsers(dateCreated);
    }

    @Override
    @Transactional
    public List<User> getAdmins() {
        return userDao.getAdmins();
    }
}
