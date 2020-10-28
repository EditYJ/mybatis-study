package com.edityj.dao;

import com.edityj.pojo.Student;
import com.edityj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class StudentMapperTest {

  private static final Logger logger = Logger.getLogger(StudentMapperTest.class);

  @Test
  public void getStudentList() {
    final SqlSession session = MybatisUtil.getSession();
    final StudentMapper mapper = session.getMapper(StudentMapper.class);
    final List<Student> studentList = mapper.getStudentList();

    for (Student student : studentList) {
      logger.debug(student);
    }
    session.close();
  }
}
