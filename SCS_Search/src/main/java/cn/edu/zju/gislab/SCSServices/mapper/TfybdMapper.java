package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Tfybd;
import cn.edu.zju.gislab.SCSServices.po.TfybdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfybdMapper {
    int countByExample(TfybdExample example);

    int deleteByExample(TfybdExample example);

    int insert(Tfybd record);

    int insertSelective(Tfybd record);

    List<Tfybd> selectByExample(TfybdExample example);

    int updateByExampleSelective(@Param("record") Tfybd record, @Param("example") TfybdExample example);

    int updateByExample(@Param("record") Tfybd record, @Param("example") TfybdExample example);
    public List<String> selectSingleStringList(@Param(value="sqlStr") String sqlStr);
}