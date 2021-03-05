package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Accessrecord;
import cn.edu.zju.gislab.SCSServices.po.AccessrecordExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccessrecordMapper {
    int countByExample(AccessrecordExample example);

    int deleteByExample(AccessrecordExample example);

    int deleteByPrimaryKey(Date firsttime);

    int insert(Accessrecord record);

    int insertSelective(Accessrecord record);

    List<Accessrecord> selectByExample(AccessrecordExample example);

    Accessrecord selectByPrimaryKey(Date firsttime);

    int updateByExampleSelective(@Param("record") Accessrecord record, @Param("example") AccessrecordExample example);

    int updateByExample(@Param("record") Accessrecord record, @Param("example") AccessrecordExample example);

    int updateByPrimaryKeySelective(Accessrecord record);

    int updateByPrimaryKey(Accessrecord record);
}