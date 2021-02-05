package com.blog.yeonji.introduce.generator.mapper;

import com.blog.yeonji.introduce.generator.model.CmitMemberRecommend;
import com.blog.yeonji.introduce.generator.model.CmitMemberRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmitMemberRecommendMapper {
    long countByExample(CmitMemberRecommendExample example);

    int deleteByExample(CmitMemberRecommendExample example);

    int deleteByPrimaryKey(Integer RM_SKEY);

    int insert(CmitMemberRecommend record);

    int insertSelective(CmitMemberRecommend record);

    List<CmitMemberRecommend> selectByExample(CmitMemberRecommendExample example);

    CmitMemberRecommend selectByPrimaryKey(Integer RM_SKEY);

    int updateByExampleSelective(@Param("record") CmitMemberRecommend record, @Param("example") CmitMemberRecommendExample example);

    int updateByExample(@Param("record") CmitMemberRecommend record, @Param("example") CmitMemberRecommendExample example);

    int updateByPrimaryKeySelective(CmitMemberRecommend record);

    int updateByPrimaryKey(CmitMemberRecommend record);
}