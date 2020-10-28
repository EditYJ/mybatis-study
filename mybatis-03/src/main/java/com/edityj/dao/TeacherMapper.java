package com.edityj.dao;

import com.edityj.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
  Teacher getTeacherById(@Param("tid") int id);
  Teacher getTeacherById2(@Param("tid") int id);
}
