package cn.crm.ruhubao.mapper.jilu;

import cn.crm.ruhubao.pojo.jilu.PushSuccess;
import cn.crm.ruhubao.pojo.jilu.PushSuccessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PushSuccessMapper {
    int countByExample(PushSuccessExample example);

    int deleteByExample(PushSuccessExample example);

    int deleteByPrimaryKey(Integer psId);

    int insert(PushSuccess record);

    int insertSelective(PushSuccess record);

    List<PushSuccess> selectByExample(PushSuccessExample example);

    PushSuccess selectByPrimaryKey(Integer psId);

    int updateByExampleSelective(@Param("record") PushSuccess record, @Param("example") PushSuccessExample example);

    int updateByExample(@Param("record") PushSuccess record, @Param("example") PushSuccessExample example);

    int updateByPrimaryKeySelective(PushSuccess record);

    int updateByPrimaryKey(PushSuccess record);
}