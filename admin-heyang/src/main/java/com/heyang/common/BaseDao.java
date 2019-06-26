package com.heyang.common;

import java.util.List;

/**
 * @ProjectName: mybatisgeneator
 * @Package: common
 * @Description: Dao层的父类
 * @Author: heyang
 * @CreateDate: 2019/6/10 12:34
 */
public interface BaseDao<T> {
    /**
     * 根据ID查找
     * @param id
     * @return
     */
    T get(String id);

    /**
     * 根据条件查找
     * @param entity
     * @return
     */
    List<T> find(T entity);

    /**
     * 插入数据
     * @param entity
     * @return
     */
    int insert(T entity);

    /**
     * 更新数据
     * @param entity
     * @return
     */
    int update(T entity);

    /**
     * 删除数据
     * @param id
     * @return
     */
    int delete(String id);
}
