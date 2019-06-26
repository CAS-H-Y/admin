package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.UmsAdmin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface UmsAdminMapper extends BaseDao<UmsAdmin> {
    List<UmsAdmin> findByUserName(String username);
}