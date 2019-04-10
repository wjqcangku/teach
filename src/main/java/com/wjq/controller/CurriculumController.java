package com.wjq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjq.entity.Curriculum;
import com.wjq.entity.Sclass;
import com.wjq.service.CurriculumService;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Curriculum)表控制层
 *
 * @author makejava
 * @since 2019-03-25 17:08:25
 */
@Controller
public class CurriculumController {
    /**
     * 服务对象
     */
    @Resource
    private CurriculumService curriculumService;

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("")
    public Curriculum selectOne(Integer id) {
        return this.curriculumService.queryById(id);
    }
    @RequestMapping(value="lesson.do")
    public String  queryAll(@RequestParam(required = false,
            defaultValue = "1",value = "pageNo")Integer pageNo
            , HttpServletRequest request) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
            String currstatus = request.getParameter("currstatus");
            String currname = request.getParameter("currname");
           Curriculum curriculum=new Curriculum();
           curriculum.setCurrstatus(currstatus);
           curriculum.setCurrname(currname);
            PageHelper.startPage(pageNo, 5);
            List<Curriculum> list = curriculumService.queryAll(curriculum);
            PageInfo pageInfo = new PageInfo<>(list, 5);
            request.setAttribute("content", list);
            request.setAttribute("pageInfo", pageInfo);
            return "listLesson";

    }

    @RequestMapping("cuurDeleteById.do")
    @ResponseBody
    public Map<String,Object> deleteSc(@RequestParam(value = "id")Integer id){
        Map<String,Object> map=new HashMap<>();
        boolean k=curriculumService.deleteById(id);
        if(k){
            map.put("message",true);
        }else{
            map.put("message",false);
        }
        return map;


    }
    @RequestMapping("/createCuur.do")
    @ResponseBody
    public Map<String,Object> insert(Curriculum curriculum){
        Map<String,Object> map=new HashMap<>();
        String sclastdate= df.format(new Date());
        curriculum.setCurrlastdate(sclastdate);
        Curriculum k=curriculumService.insert(curriculum);
        if(k!=null){

            map.put("message",true);
        }else{
            map.put("message",false);
        }

        return map;
    }
    @GetMapping("selectcuurById.do")
    public  String    selectById(Integer id,HttpServletRequest request){
        Curriculum curriculum=curriculumService.queryById(id);
        request.setAttribute("curr",curriculum);
        return "editlesson";
    }

    @RequestMapping("/updateCuur.do")
    @ResponseBody
    public Map<String,Object> update(Curriculum curriculum){
        Map<String,Object> ma=new HashMap<>();
        curriculum.setCurrlastdate(df.format(new Date()));
        Curriculum l=curriculumService.update(curriculum);
        if(l!=null){
            ma.put("message",true);
        }else{
            ma.put("message",false);
        }

        return ma;
    }

}