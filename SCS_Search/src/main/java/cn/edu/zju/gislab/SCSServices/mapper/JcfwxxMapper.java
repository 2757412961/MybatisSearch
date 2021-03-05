package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Jcfwxx;
import cn.edu.zju.gislab.SCSServices.po.JcfwxxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JcfwxxMapper {
    int countByExample(JcfwxxExample example);

    int deleteByExample(JcfwxxExample example);

    int deleteByPrimaryKey(String period);

    int insert(Jcfwxx record);

    int insertSelective(Jcfwxx record);

    List<Jcfwxx> selectByExample(JcfwxxExample example);

    Jcfwxx selectByPrimaryKey(String period);

    int updateByExampleSelective(@Param("record") Jcfwxx record, @Param("example") JcfwxxExample example);

    int updateByExample(@Param("record") Jcfwxx record, @Param("example") JcfwxxExample example);

    int updateByPrimaryKeySelective(Jcfwxx record);

    int updateByPrimaryKey(Jcfwxx record);
}