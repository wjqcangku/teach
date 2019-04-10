package com.wjq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjq.entity.Graduation;
import com.wjq.entity.Studentinfo;
import com.wjq.entity.Teacher;
import com.wjq.service.GraduationService;
import com.wjq.service.StudentinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Studentinfo)表控制层
 *
 * @author makejava
 * @since 2019-04-08 15:18:30
 */
@Controller
public class StudentinfoController {
    /**
     * 服务对象
     */
    @Resource
    private StudentinfoService studentinfoService;

//    @Autowired
//    private GraduationService graduationService;

    @Resource
    private GraduationService graduationService;

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("")
    public Studentinfo selectOne(Integer id) {
        return this.studentinfoService.queryById(id);
    }
    @RequestMapping(value="studentinfo.do")
    public String  queryAll(@RequestParam(required = false,
            defaultValue = "1",value = "pageNo")Integer pageNo
            , HttpServletRequest request){
        Studentinfo studentinfo=new Studentinfo();
        PageHelper.startPage(pageNo, 5);
        List<Studentinfo> list = studentinfoService.querryAll(studentinfo);
        PageInfo pageInfo = new PageInfo<>(list, 5);
        request.setAttribute("content", list);
        request.setAttribute("pageInfo", pageInfo);
        return "liststudentinfo";

    }
    @RequestMapping("/addstudentinfo.do")
    @ResponseBody
    public Map<String,Object> insert(Studentinfo studentinfo){
        Map<String,Object> map=new HashMap<>();
        studentinfo.setStustatus("0");
        studentinfo.setSdate(df.format(new Date()));
        studentinfo.setSlastdate(df.format(new Date()));
        Studentinfo k=studentinfoService.insert(studentinfo);
        if(k!=null){

            map.put("message",true);
        }else{
            map.put("message",false);
        }

        return map;
    }

    @RequestMapping("studentinfoDeleteById.do")
    @ResponseBody
    public Map<String,Object> delete(@RequestParam(value = "id")Integer id){
        Map<String,Object> map=new HashMap<>();
        boolean k=studentinfoService.deleteById(id);
        if(k){
            map.put("message",true);
        }else{
            map.put("message",false);
        }
        return map;


    }
    @GetMapping("studentinfoById.do")
    public  String    selectById(Integer id,HttpServletRequest request){
        Studentinfo studentinfo=studentinfoService.queryById(id);
        request.setAttribute("sti",studentinfo);
        return "editstudentinfo";
    }


    @RequestMapping("/updatestudentinfo.do")
    @ResponseBody
    public Map<String,Object> update(Studentinfo studentinfo){
        Map<String,Object> ma=new HashMap<>();
        Studentinfo k=null;
        Graduation graduation=new Graduation();
        studentinfo.setSlastdate(df.format(new Date()));
        if("大一新生".equals(studentinfo.getStustatus())){
            studentinfo.setStustatus("0");
            k=studentinfoService.update(studentinfo);
        }
        if("大二学生".equals(studentinfo.getStustatus())){
            studentinfo.setStustatus("1");
            k=studentinfoService.update(studentinfo);
        }
        if("大三学生".equals(studentinfo.getStustatus())){
            studentinfo.setStustatus("2");
            k=studentinfoService.update(studentinfo);
        }
        if("大四学生".equals(studentinfo.getStustatus())){
            studentinfo.setStustatus("3");
            k=studentinfoService.update(studentinfo);
        }
        if("已就业".equals(studentinfo.getStustatus())){
            studentinfo.setStustatus("4");
            k=studentinfoService.update(studentinfo);
            Studentinfo studentinfo2=studentinfoService.queryById(studentinfo.getId());
            graduation.setGname(studentinfo2.getSname());
            graduation.setGage(studentinfo2.getSage());
            graduation.setGsex(studentinfo2.getSsex());
            graduation.setGlastdate(studentinfo2.getSlastdate());
            graduation.setGphone(studentinfo2.getSphone());
            graduation.setStus(4);
            graduation.setGlength("0年");
            graduation.setGdetination(studentinfo2.getSdestination());
            Graduation j=studentinfoService.insertgra(graduation);
        }
        if(k!=null){
            ma.put("message",true);
        }else{
            ma.put("message",false);
        }

        return ma;
    }



}