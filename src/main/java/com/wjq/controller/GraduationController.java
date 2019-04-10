package com.wjq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjq.entity.Graduation;
import com.wjq.entity.Teacher;
import com.wjq.service.GraduationService;
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
 * (Graduation)表控制层
 *
 * @author makejava
 * @since 2019-04-09 14:50:42
 */
@Controller
public class GraduationController {
    /**
     * 服务对象
     */
    @Resource
    private GraduationService graduationService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("selectOne")
    public Graduation selectOne(Integer id) {
        return this.graduationService.queryById(id);
    }


    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @RequestMapping(value="graduation.do")
    public String  queryAll(@RequestParam(required = false,
            defaultValue = "1",value = "pageNo")Integer pageNo
            , HttpServletRequest request){
        Graduation graduation=new Graduation();
        PageHelper.startPage(pageNo, 5);
        List<Graduation> list = graduationService.querryAll(graduation);
        PageInfo pageInfo = new PageInfo<>(list, 5);
        request.setAttribute("content", list);
        request.setAttribute("pageInfo", pageInfo);
        return "listgraduation";

    }

    @GetMapping("selectgraById.do")
    public  String    selectById(Integer id,HttpServletRequest request){
        Graduation graduation=graduationService.queryById(id);
        request.setAttribute("gra",graduation);
        return "editgraduation";
    }


    @RequestMapping("/updategratua.do")
    @ResponseBody
    public Map<String,Object> update(Graduation graduation){
        Map<String,Object> ma=new HashMap<>();
        graduation.setGlastdate(df.format(new Date()));
        Graduation k=graduationService.update(graduation);
        if(k!=null){
            ma.put("message",true);
        }else{
            ma.put("message",false);
        }

        return ma;
    }


}