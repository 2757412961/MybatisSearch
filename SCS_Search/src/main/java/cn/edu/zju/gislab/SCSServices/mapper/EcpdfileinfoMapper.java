package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Ecpdfileinfo;
import cn.edu.zju.gislab.SCSServices.po.EcpdfileinfoExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcpdfileinfoMapper {
    int countByExample(EcpdfileinfoExample example);

    int deleteByExample(EcpdfileinfoExample example);

    int deleteByPrimaryKey(BigDecimal fileid);

    int insert(Ecpdfileinfo record);

    int insertSelective(Ecpdfileinfo record);

    List<Ecpdfileinfo> selectByExample(EcpdfileinfoExample example);

    Ecpdfileinfo selectByPrimaryKey(BigDecimal fileid);

    int updateByExampleSelective(@Param("record") Ecpdfileinfo record, @Param("example") EcpdfileinfoExample example);

    int updateByExample(@Param("record") Ecpdfileinfo record, @Param("example") EcpdfileinfoExample example);

    int updateByPrimaryKeySelective(Ecpdfileinfo record);

    int updateByPrimaryKey(Ecpdfileinfo record);
}