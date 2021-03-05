package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.Ecpddetail;
import cn.edu.zju.gislab.SCSServices.po.EcpddetailExample;
import cn.edu.zju.gislab.SCSServices.po.EcpddetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EcpddetailMapper {
    int countByExample(EcpddetailExample example);

    int deleteByExample(EcpddetailExample example);

    int deleteByPrimaryKey(EcpddetailKey key);

    int insert(Ecpddetail record);

    int insertSelective(Ecpddetail record);

    List<Ecpddetail> selectByExampleWithBLOBs(EcpddetailExample example);

    List<Ecpddetail> selectByExample(EcpddetailExample example);

    Ecpddetail selectByPrimaryKey(EcpddetailKey key);

    int updateByExampleSelective(@Param("record") Ecpddetail record, @Param("example") EcpddetailExample example);

    int updateByExampleWithBLOBs(@Param("record") Ecpddetail record, @Param("example") EcpddetailExample example);

    int updateByExample(@Param("record") Ecpddetail record, @Param("example") EcpddetailExample example);

    int updateByPrimaryKeySelective(Ecpddetail record);

    int updateByPrimaryKeyWithBLOBs(Ecpddetail record);

    int updateByPrimaryKey(Ecpddetail record);
}