package com.yt.controller;

import com.yt.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangsan
 * @version 1.0
 * @package com.yt.controller
 * @date 2016/4/29 0029 11:14
 * @descption: 疯狂的王麻子团队!
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/dubbo")
    @ResponseBody
    public String dubbo() {
        return userService.hello("自己的dubbo服务");
    }
}
