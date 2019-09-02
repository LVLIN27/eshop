package com.qingshixun.project.eshop.module.newer.controller;

import com.qingshixun.project.eshop.web.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/front/newer")
public class NewerController extends BaseController {

    @RequestMapping(value = "/guide")
    public String newerGuide(){
        return "/newer/guide";
    }
}
