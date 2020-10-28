package com.edityj.dao;

import com.edityj.pojo.Student;
import com.edityj.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestStudentMapper {
  private static final Logger logger = Logger.getLogger(TestStudentMapper.class);

  @Test
  public void getStudentById() {
    final SqlSession session = MyBatisUtil.getSession();
    final StudentMapper mapper = session.getMapper(StudentMapper.class);
    final Student s = mapper.getStudentById(1);

    logger.debug("查询结果==>" + s);
    session.close();
  }

  @Test
  public void getStudentById2() {
    final SqlSession session = MyBatisUtil.getSession();
    final StudentMapper mapper = session.getMapper(StudentMapper.class);
    final Student s = mapper.getStudentById2(1);

    logger.debug("查询结果==>" + s);
    session.close();
  }

  @Test
  public void getStudentById3() {
    final SqlSession session = MyBatisUtil.getSession();
    final StudentMapper mapper = session.getMapper(StudentMapper.class);
    final Student s = mapper.getStudentById3(1);

    logger.debug("查询结果==>" + s);
    session.close();
  }
}
