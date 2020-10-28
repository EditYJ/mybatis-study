package com.edityj.dao;

import com.edityj.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
  List<User> getList();

  User getUser(int id);

  int insertUser(User user);

  int updateUser(Map<String, Object> user);

  int deleteUser(int id);
}
