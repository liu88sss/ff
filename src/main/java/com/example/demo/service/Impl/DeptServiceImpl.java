package com.example.demo.service.Impl;


import com.example.demo.domain.Dept;
import com.example.demo.mapper.DeptMapper;
import com.example.demo.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//等同于component
@Transactional
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    //    @Transactional //事务处理，基本上所有的Service层都需要事务
    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    //    @Transactional //事务处理，基本上所有的Service层都需要事务
    @Override
    public boolean delete(Integer deptNo) {
        return deptMapper.deleteByDeptNo(deptNo) > 0 ? true : false;
    }


    //    @Transactional //事务处理，基本上所有的Service层都需要事务
    @Override
    public boolean save(Dept dept) {
        return deptMapper.save(dept) > 0 ? true : false;
    }
}
