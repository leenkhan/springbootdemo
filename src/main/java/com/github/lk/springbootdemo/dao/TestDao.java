package com.github.lk.springbootdemo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface TestDao {

	@Select("select * from ch_card;")
    public List<Map<String,Object>> find();
}
