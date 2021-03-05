package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.BuoyLast2;
import cn.edu.zju.gislab.SCSServices.po.BuoyLast2Example;
import cn.edu.zju.gislab.SCSServices.po.BuoyLast2Key;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuoyLast2Mapper {
    int countByExample(BuoyLast2Example example);

    int deleteByExample(BuoyLast2Example example);

    int deleteByPrimaryKey(BuoyLast2Key key);

    int insert(BuoyLast2 record);

    int insertSelective(BuoyLast2 record);

    List<BuoyLast2> selectByExample(BuoyLast2Example example);

    BuoyLast2 selectByPrimaryKey(BuoyLast2Key key);

    int updateByExampleSelective(@Param("record") BuoyLast2 record, @Param("example") BuoyLast2Example example);

    int updateByExample(@Param("record") BuoyLast2 record, @Param("example") BuoyLast2Example example);

    int updateByPrimaryKeySelective(BuoyLast2 record);

    int updateByPrimaryKey(BuoyLast2 record);
}