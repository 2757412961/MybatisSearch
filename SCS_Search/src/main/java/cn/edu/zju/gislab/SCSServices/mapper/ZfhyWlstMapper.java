package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.ZfhyWlst;
import cn.edu.zju.gislab.SCSServices.po.ZfhyWlstExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZfhyWlstMapper {
    int countByExample(ZfhyWlstExample example);

    int deleteByExample(ZfhyWlstExample example);

    int insert(ZfhyWlst record);

    int insertSelective(ZfhyWlst record);

    List<ZfhyWlst> selectByExample(ZfhyWlstExample example);

    int updateByExampleSelective(@Param("record") ZfhyWlst record, @Param("example") ZfhyWlstExample example);

    int updateByExample(@Param("record") ZfhyWlst record, @Param("example") ZfhyWlstExample example);
}