package com.edityj.dao;

import com.edityj.pojo.Teacher;
import com.edityj.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TeacherMapperTest {

  private static final Logger logger = Logger.getLogger(StudentMapperTest.class);

  @Test
  public void getTeacherById(){
    final SqlSession session = MybatisUtil.getSession();
    final TeacherMapper mapper = session.getMapper(TeacherMapper.class);
    final Teacher teacherById = mapper.getTeacherById(1);

    logger.debug(teacherById);
    session.close();
  }

  @Test
  public void getTeacherById2(){
    final SqlSession session = MybatisUtil.getSession();
    final TeacherMapper mapper = session.getMapper(TeacherMapper.class);
    final Teacher teacherById = mapper.getTeacherById2(1);

    logger.debug(teacherById);
    session.close();
  }
}
