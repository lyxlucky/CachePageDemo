package com.lyx.services;

import com.lyx.entity.User;

import java.util.List;
import java.util.Map;

/**
 * @author liao
 * @date 2023/7/10 13:36
 */
public interface UserService {

    public Map<String,Object> getAllUser(Integer pageNum, Integer pageSize);

}
