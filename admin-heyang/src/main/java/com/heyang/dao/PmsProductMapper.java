package com.heyang.dao;

import com.heyang.common.BaseDao;
import com.heyang.entity.PmsProduct;
import com.heyang.entity.PmsProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PmsProductMapper extends BaseDao<PmsProduct> {
}