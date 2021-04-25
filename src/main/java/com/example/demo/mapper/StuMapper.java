package com.example.demo.mapper;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface StuMapper {

     List<Map> list();

}
