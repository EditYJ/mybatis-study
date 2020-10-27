package com.edityj.dao;

import com.edityj.pojo.User;
import com.edityj.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestUserDao {

  @Test
  public void getList() {
    final SqlSession session = MyBatisUtil.getSession();

    final UserDao user = session.getMapper(UserDao.class);
    final List<User> userList = user.getList();

    System.out.println(userList);

    session.close();

  }

  @Test
  public void getUser() {
    final SqlSession session = MyBatisUtil.getSession();
    final UserDao mapper = session.getMapper(UserDao.class);
    final User user = mapper.getUser(1);
    System.out.println(user);
    session.close();
  }

  @Test
  public void insertUser() {
    final SqlSession session = MyBatisUtil.getSession();
    final UserDao mapper = session.getMapper(UserDao.class);
    mapper.insertUser(new User(4, "俞杰", "123456"));
    session.commit();
    session.close();
  }

  @Test
  public void updateUser() {
    final SqlSession session = MyBatisUtil.getSession();
    final UserDao mapper = session.getMapper(UserDao.class);
    mapper.updateUser(new User(4, "你好哇", "333333"));
    session.commit();
    session.close();
  }

  @Test
  public void deleteUser(){
    final SqlSession session = MyBatisUtil.getSession();
    final UserDao mapper = session.getMapper(UserDao.class);
    mapper.deleteUser(4);
    session.commit();
    session.close();
  }
}
