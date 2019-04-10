package com.wjq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjq.entity.Curriculum;
import com.wjq.entity.Teacher;
import com.wjq.service.TeacherService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Teacher)表控制层
 *
 * @author makejava
 * @since 2019-03-27 10:14:31
 */
@Controller
public class TeacherController {
    /**
     * 服务对象
     */
    @Resource
    private TeacherService teacherService;

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    public Teacher selectOne(Integer id) {
        return this.teacherService.queryById(id);
    }

    @RequestMapping(value="teacher.do")
    public String  queryAll(@RequestParam(required = false,
            defaultValue = "1",value = "pageNo")Integer pageNo
            , HttpServletRequest request){
        Teacher teacher=new Teacher();
        PageHelper.startPage(pageNo, 5);
        List<Teacher> list = teacherService.querryAll(teacher);
        PageInfo pageInfo = new PageInfo<>(list, 5);
        request.setAttribute("content", list);
        request.setAttribute("pageInfo", pageInfo);
        return "listteacher";

    }

    @RequestMapping("/addteacher.do")
    @ResponseBody
    public Map<String,Object> insert(Teacher teacher){
        Map<String,Object> map=new HashMap<>();
        teacher.setTlastdate(df.format(new Date()));
        Teacher k=teacherService.insert(teacher);
        if(k!=null){

            map.put("message",true);
        }else{
            map.put("message",false);
        }

        return map;
    }

    @RequestMapping("teacherDeleteById.do")
    @ResponseBody
    public Map<String,Object> delete(@RequestParam(value = "tid")Integer tid){
        Map<String,Object> map=new HashMap<>();
        boolean k=teacherService.deleteById(tid);
        if(k){
            map.put("message",true);
        }else{
            map.put("message",false);
        }
        return map;


    }

    @GetMapping("selectteachById.do")
    public  String    selectById(Integer tid,HttpServletRequest request){
        Teacher teacher=teacherService.queryById(tid);
        request.setAttribute("teach",teacher);
        return "editteacher";
    }


    @RequestMapping("/updateTeacher.do")
    @ResponseBody
    public Map<String,Object> update(Teacher teacher){
        Map<String,Object> ma=new HashMap<>();
        teacher.setTlastdate(df.format(new Date()));
        Teacher k=teacherService.update(teacher);
        if(k!=null){
            ma.put("message",true);
        }else{
            ma.put("message",false);
        }

        return ma;
    }












}