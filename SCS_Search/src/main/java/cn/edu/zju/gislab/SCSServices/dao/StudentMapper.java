package cn.edu.zju.gislab.SCSServices.dao;

import cn.edu.zju.gislab.SCSServices.po.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StudentMapper {

    List<Student> getAllStudents();

    List<Student> getAllStudents2();

    @Select("SELECT * FROM student WHERE id=#{id}")
    Student getStudstudentsentsByID(int id);

    @Select("SELECT * FROM student WHERE tid=#{tid}")
    Student getStudstudentsentsByTID(int tid);

}
