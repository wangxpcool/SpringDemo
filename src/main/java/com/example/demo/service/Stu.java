package com.example.demo.service;

import com.example.demo.mapper.StuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class Stu {

    @Autowired
    StuMapper stuMapper;

    public List<Map> list(){
        return stuMapper.list();
    }

}
