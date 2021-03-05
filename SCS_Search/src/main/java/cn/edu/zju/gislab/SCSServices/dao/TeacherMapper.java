package cn.edu.zju.gislab.SCSServices.dao;

import cn.edu.zju.gislab.SCSServices.po.Teacher;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getAllTeachers();

    Teacher getTeacherByID(int id);

    Teacher getTeacherD2O1(int id);

    Teacher getTeacherD2O2(int id);


}
