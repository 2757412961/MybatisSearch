package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Tepo;
import cn.edu.zju.gislab.SCSServices.po.TepoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TepoMapper {
    int countByExample(TepoExample example);

    int deleteByExample(TepoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Tepo record);

    int insertSelective(Tepo record);

    List<Tepo> selectByExample(TepoExample example);

    Tepo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tepo record, @Param("example") TepoExample example);

    int updateByExample(@Param("record") Tepo record, @Param("example") TepoExample example);

    int updateByPrimaryKeySelective(Tepo record);

    int updateByPrimaryKey(Tepo record);

    List<Tepo> selectSingleStringList(@Param(value = "sqlStr") String sqlStr);
}