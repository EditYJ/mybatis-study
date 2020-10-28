package com.edityj.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
  private static SqlSessionFactory sqlSessionFactory;

  static {
    try {
      String config = "mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(config);
      sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static SqlSession getSession() {
    return sqlSessionFactory.openSession();
  }
}
