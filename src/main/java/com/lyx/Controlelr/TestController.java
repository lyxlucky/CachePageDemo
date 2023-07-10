package com.lyx.Controlelr;

import com.github.pagehelper.PageHelper;
import com.lyx.entity.User;
import com.lyx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author liao
 * @date 2023/7/10 13:25
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{pageNum}/{pageSize}")
    public Map<String,Object> getAll(@PathVariable Integer pageNum, @PathVariable Integer pageSize){
        return userService.getAllUser(pageNum, pageSize);
    }

}
