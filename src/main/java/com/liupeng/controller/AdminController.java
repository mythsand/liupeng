package com.liupeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mythsand on 12/04/2017.
 */
@Controller
public class AdminController {
    @RequestMapping("/")
    public String mainAdmin(){
        return "/front/index";
    }
}
