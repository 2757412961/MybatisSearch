package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Wlstybd;
import cn.edu.zju.gislab.SCSServices.po.WlstybdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WlstybdMapper {
    int countByExample(WlstybdExample example);

    int deleteByExample(WlstybdExample example);

    int insert(Wlstybd record);

    int insertSelective(Wlstybd record);

    List<Wlstybd> selectByExample(WlstybdExample example);

    int updateByExampleSelective(@Param("record") Wlstybd record, @Param("example") WlstybdExample example);

    int updateByExample(@Param("record") Wlstybd record, @Param("example") WlstybdExample example);
    public List<String> selectSingleStringList(@Param(value="sqlStr") String sqlStr);

}