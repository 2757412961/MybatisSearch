package cn.edu.zju.gislab.SCSServices.po;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Alias("Student")
public class Student {
    private int id;
    private String name;
    private Teacher teacher;
}
