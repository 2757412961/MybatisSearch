package cn.edu.zju.gislab.SCSServices.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.util.List;

@Data
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Alias("Teacher")
public class Teacher {
    private int id;
    private String name;

    private List<Student> students;
}
