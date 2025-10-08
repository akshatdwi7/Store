package com.testing.Store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/" )
    String viewName = getViewName();
    public String index() {return viewName;}

    private  String getViewName(){
        return "index";
    }

}
