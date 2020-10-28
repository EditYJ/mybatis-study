package com.edityj.dao;

import com.edityj.pojo.User;
import com.edityj.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestUserMapper {
  private static final Logger logger = Logger.getLogger(TestUserMapper.class);

  @Test
  public void getUserById() {
    logger.debug("进入getUserById方法");
    final SqlSession session = MyBatisUtil.getSession();


    final UserMapper mapper = session.getMapper(UserMapper.class);
    final User user = mapper.getUserById(2);
    System.out.println(user);

    session.close();
  }
}
