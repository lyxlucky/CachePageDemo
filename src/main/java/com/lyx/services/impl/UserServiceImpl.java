package com.lyx.services.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lyx.dao.UserDao;
import com.lyx.entity.User;
import com.lyx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liao
 * @date 2023/7/10 13:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Cacheable(value = "users", key = "#pageNum + '-' + #pageSize")
    public Map<String,Object> getAllUser(Integer pageNum, Integer pageSize) {
        HashMap<String, Object> map = new HashMap<>(16);
        Page<Object> pages = PageHelper.startPage(pageNum, pageSize);
        List<User> users = userDao.getAllUser();
        map.put("data",users);
        //想要啥在这自己拿就行
        map.put("total",pages.getTotal());
        return map;
    }
}
