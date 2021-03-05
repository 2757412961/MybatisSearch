package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Hqybd;
import cn.edu.zju.gislab.SCSServices.po.HqybdExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface HqybdMapper {
    int countByExample(HqybdExample example);

    int deleteByExample(HqybdExample example);

    int insert(Hqybd record);

    int insertSelective(Hqybd record);

    List<Hqybd> selectByExample(HqybdExample example);

    int updateByExampleSelective(@Param("record") Hqybd record, @Param("example") HqybdExample example);

    int updateByExample(@Param("record") Hqybd record, @Param("example") HqybdExample example);

    public List<String> selectSingleStringList(@Param(value = "sqlStr") String sqlStr);
}