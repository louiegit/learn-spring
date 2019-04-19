package com.learn.spring.transactionjta.domain;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface UserDOMapper {
    long countByExample(UserDOCriteria example);

    int deleteByExample(UserDOCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExampleWithRowbounds(UserDOCriteria example, RowBounds rowBounds);

    List<UserDO> selectByExample(UserDOCriteria example);

    UserDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserDOCriteria example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
}