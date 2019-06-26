package com.heyang.service;

import com.heyang.dto.UmsAdminParam;
import com.heyang.entity.UmsAdmin;
import com.heyang.entity.UmsPermission;

import java.util.List;

/**
 * @ProjectName: mall-heyang
 * @Package: com.heyang.service.impl
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/21 10:57
 */
public interface UmsAdminService {
    /**
     * 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * 注册功能
     */
    UmsAdmin register(UmsAdminParam umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    List<UmsPermission> getPermissionList(Long adminId);

}
