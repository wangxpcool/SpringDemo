package com.example.demo.web;

import com.example.demo.service.Stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tt")
public class tt {

    @Autowired
    Stu stu;

    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    @ResponseBody
    public String fu(){
        System.out.println(113);
        return "123";
    }


    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    @ResponseBody
    public Object list(){
        System.out.println(113);
        return stu.list();
    }

}
