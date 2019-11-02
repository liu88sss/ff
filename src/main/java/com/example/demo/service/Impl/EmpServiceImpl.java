package com.example.demo.service.Impl;

import com.example.demo.domain.Dept;
import com.example.demo.domain.Emp;
import com.example.demo.mapper.DeptMapper;
import com.example.demo.mapper.EmpMapper;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.ServiceMode;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private DeptMapper deptMapper;
    @Autowired
    private EmpMapper empMapper;

    @Override
    @Transactional
    public boolean save(Emp emp) {
        Dept dept = emp.getDept();
        if (deptMapper.findByDeptNo(dept.getDeptNo()) == null)
            deptMapper.save(dept);
        return empMapper.save(emp) > 0 ? true : false;
    }
}
