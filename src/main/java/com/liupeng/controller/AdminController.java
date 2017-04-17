package com.liupeng.controller;

import org.dom4j.io.STAXEventReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.print.DocFlavor;

/**
 * Created by mythsand on 12/04/2017.
 */
@Controller
public class AdminController {
    @RequestMapping("index")
    public String index(){
        return "/index";
    }
    @RequestMapping("")
    public String index1(){
        return "/index";
    }
    @RequestMapping("dashboard")
    public String dashboard(){
        return "/dashboard";
    }
    @RequestMapping("blog-new")
    public String blogBlog(){
        return "/blog-new";
    }
    @RequestMapping("blog-table")
    public String blogTimeline(){
        return "/blog-table";
    }
    @RequestMapping("comments-timeline")
    public String commentsTimeLine(){
        return "/comments-timeline";
    }
    @RequestMapping("files")
    public String files(){
        return "/files";
    }
    @RequestMapping("files-upload")
    public String filesUp(){
        return "/files-upload";
    }
    @RequestMapping("icon-fonts")
    public String iconFonts(){
        return "/icon-fonts";
    }
    @RequestMapping("page-new")
    public String pageNew(){
        return "/page-new";
    }
    @RequestMapping("page-table")
    public String pageTable(){
        return "/page-table";
    }
    @RequestMapping("page-timeline")
    public String pageTimeLine(){return "/page-timeline";}
    @RequestMapping("statistics")
    public String statistics(){
        return "/statistics";
    }
    @RequestMapping("ui-elements")
    public String uiElements(){
        return "/ui-elements";
    }
    @RequestMapping("test")
    public String test(){
        return "/test";
    }
    @RequestMapping("/admin/project")
    public String adminProject(){return "/admin/project";}
}
