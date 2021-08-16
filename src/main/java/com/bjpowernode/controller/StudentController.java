package com.bjpowernode.controller;

import com.bjpowernode.entity.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private StudentService service;

    @RequestMapping("/addStudent")
    public ModelAndView addStudent(Student student){
        //调用service处理student
        int nums = service.addStudent(student);
        ModelAndView mv = new ModelAndView();
        String tips = "注册失败！";
        if (nums>0){
            //添加成功
            tips = "学生"+"【"+student.getName()+"】"+"注册成功！";
        }
        mv.addObject("msg",tips);
        mv.setViewName("/view1");
        return mv;
    }

    //处理查询，响应ajax
    @RequestMapping("/findStudents")
    @ResponseBody
    public List<Map<String,Object>> findStudent(){
        List<Map<String,Object>> list = service.findStudents();
        return list;
    }
}
