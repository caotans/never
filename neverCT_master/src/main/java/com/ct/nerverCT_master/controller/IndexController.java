package com.ct.nerverCT_master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Controller
public class IndexController {
//    @Autowired
//    private CustomerService customerService;
    @RequestMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name","成功!");
        return "index";
    }


}
