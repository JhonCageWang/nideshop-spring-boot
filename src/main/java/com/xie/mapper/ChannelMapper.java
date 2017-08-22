package com.xie.mapper;

import com.xie.bean.Channel;

import java.util.List;

public interface ChannelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Channel record);

    int insertSelective(Channel record);

    Channel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Channel record);

    int updateByPrimaryKey(Channel record);

    List<Channel> selectAll();
}