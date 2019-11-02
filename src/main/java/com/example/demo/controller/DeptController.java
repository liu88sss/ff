package com.example.demo.controller;


import com.example.demo.domain.Dept;
import com.example.demo.domain.Emp;
import com.example.demo.mapper.DeptMapper;
import com.example.demo.service.DeptService;
import com.example.demo.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Controller
public class DeptController {


    @Autowired
    private DeptService deptService;
    @Autowired
    private EmpService empService;

    //    private DeptMapper deptMapper;
    @RequestMapping("/depts")
    public String depts(Model model) {
        List<Dept> depts = deptService.findAll();
        depts.forEach(System.out::println);

        model.addAttribute("depts", depts);
        return "depts";
//        return "help";
    }

    @RequestMapping("/")
    public String log() {
        return "depts";
    }


    @RequestMapping("/saveEmp")
    public String saveEmp(Emp emp) {
        if (empService.save(emp)) return "good";
        else return "";
    }

    @RequestMapping("/save")
    public String save(Dept dept) {
        deptService.save(dept);
        return "redirect:/depts";

    }


}
