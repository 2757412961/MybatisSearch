package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Zfybd;
import cn.edu.zju.gislab.SCSServices.po.ZfybdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZfybdMapper {
    int countByExample(ZfybdExample example);

    int deleteByExample(ZfybdExample example);

    int insert(Zfybd record);

    int insertSelective(Zfybd record);

    List<Zfybd> selectByExample(ZfybdExample example);

    int updateByExampleSelective(@Param("record") Zfybd record, @Param("example") ZfybdExample example);

    int updateByExample(@Param("record") Zfybd record, @Param("example") ZfybdExample example);
    public List<String> selectSingleStringList(@Param(value="sqlStr") String sqlStr);
}