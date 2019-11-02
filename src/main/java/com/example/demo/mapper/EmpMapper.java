package com.example.demo.mapper;

import com.example.demo.domain.Emp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpMapper {
    List<Emp> findAll();

    Emp findByEmpNo(Integer empNo);

    int save(Emp emp);
}
