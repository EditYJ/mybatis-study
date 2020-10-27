package com.edityj.dao;

import com.edityj.pojo.User;

import java.util.List;

public interface UserDao {
  List<User> getList();

  User getUser(int id);

  int insertUser(User user);

  int updateUser(User user);

  int deleteUser(int id);
}
