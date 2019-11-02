package com.example.demo.service;


import com.example.demo.domain.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> findAll();

    boolean delete(Integer deptNo);

    boolean save(Dept dept);
}
