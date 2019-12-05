package com.meetstone.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by shuai on 2017/5/21.
 */
@Controller
public class DemoController {
	@RequestMapping("/")
    //@ResponseBody
    String home() {
        return "Hello World!";
    }

}
