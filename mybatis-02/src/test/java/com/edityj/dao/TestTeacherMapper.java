package com.edityj.dao;

import com.edityj.pojo.Teacher;
import com.edityj.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class TestTeacherMapper {
  private static final Logger logger = Logger.getLogger(TestTeacherMapper.class);

  @Test
  public void getTeacherById() {

    final SqlSession session = MyBatisUtil.getSession();
    final TeacherMapper mapper = session.getMapper(TeacherMapper.class);
    final Teacher teacher = mapper.getTeacherById(1);
    logger.debug("查询结果==>" + teacher);
    session.close();
  }
}
