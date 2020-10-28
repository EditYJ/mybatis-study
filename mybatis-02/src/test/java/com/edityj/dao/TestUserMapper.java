package com.edityj.dao;

import com.edityj.pojo.User;
import com.edityj.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestUserMapper {

  @Test
  public void getUserById() {
    final SqlSession session = MyBatisUtil.getSession();

    final UserMapper mapper = session.getMapper(UserMapper.class);
    final User user = mapper.getUserById(2);
    System.out.println(user);

    session.close();
  }
}
