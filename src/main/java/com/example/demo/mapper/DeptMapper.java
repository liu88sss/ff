package com.example.demo.mapper;

import com.example.demo.domain.Dept;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> findAll();

    int deleteByDeptNo(@Param("deptNo") Integer deptNo);

    Dept findByDeptNo(@Param("deptNo") Integer deptNo);

    int save(Dept dept);
}
