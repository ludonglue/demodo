package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by river on 2017/7/18.
 */
@Controller
public class indexController {
    @RequestMapping("/")
    public ModelAndView index(){


        return new ModelAndView("index");
    }
}
