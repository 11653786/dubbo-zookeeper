package com.yt.service;

import com.yt.inter.UserService;

/**
 * dubbo测试实现类
 * @author zhangsan
 * @version 1.0
 * @package com.yt.service
 * @date 2016/4/29 0029 11:21
 * @descption: 疯狂的王麻子团队!
 */
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String name) {
        System.out.println("dubbo: "+name);
        return "dubbo: " + name;
    }
}
