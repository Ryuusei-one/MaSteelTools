package com.er.utils;

import com.er.constant.HttpStatus;


/**
 * 安全服务工具类
 *
 * @author Ryuusei
 */
public class SecurityUtils
{

    /**
     * 是否为管理员
     *
     * @param userId 用户ID
     * @return 结果
     */
    public static boolean isAdmin(Long userId)
    {
        return userId != null && 1L == userId;
    }
}
