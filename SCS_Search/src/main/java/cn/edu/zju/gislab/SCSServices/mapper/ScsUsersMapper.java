package cn.edu.zju.gislab.SCSServices.mapper;

import cn.edu.zju.gislab.SCSServices.po.ScsUsers;
import cn.edu.zju.gislab.SCSServices.po.ScsUsersExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScsUsersMapper {
    int countByExample(ScsUsersExample example);

    int deleteByExample(ScsUsersExample example);

    int deleteByPrimaryKey(String username);

    int insert(ScsUsers record);

    int insertSelective(ScsUsers record);

    List<ScsUsers> selectByExampleWithBLOBs(ScsUsersExample example);

    List<ScsUsers> selectByExample(ScsUsersExample example);

    ScsUsers selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") ScsUsers record, @Param("example") ScsUsersExample example);

    int updateByExampleWithBLOBs(@Param("record") ScsUsers record, @Param("example") ScsUsersExample example);

    int updateByExample(@Param("record") ScsUsers record, @Param("example") ScsUsersExample example);

    int updateByPrimaryKeySelective(ScsUsers record);

    int updateByPrimaryKeyWithBLOBs(ScsUsers record);

    int updateByPrimaryKey(ScsUsers record);

    List<ScsUsers> selectBySingleStr(@Param("sqlStr") String sqlStr);
}