package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*@Controller注解，表示该层是MVC模型中的Controller层*/
@Controller
/*@RequestMapping注解，表示该Controller的主进入目录*/
@RequestMapping(value = "/main")
public class MainController {

//    method表示请求的方法
//    @RequestMapping(method = RequestMethod.GET);
//    @ResponseBody表示返回的是一段数据
    @ResponseBody
    public String welcome(){
        return "test Web";
    }

}
