package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Hbybd;
import cn.edu.zju.gislab.SCSServices.po.HbybdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HbybdMapper {
    int countByExample(HbybdExample example);

    int deleteByExample(HbybdExample example);

    int insert(Hbybd record);

    int insertSelective(Hbybd record);

    List<Hbybd> selectByExample(HbybdExample example);

    int updateByExampleSelective(@Param("record") Hbybd record, @Param("example") HbybdExample example);

    int updateByExample(@Param("record") Hbybd record, @Param("example") HbybdExample example);

    public List<String> selectSingleStringList(@Param(value="sqlStr") String sqlStr);

}