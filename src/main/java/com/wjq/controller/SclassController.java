package com.wjq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wjq.entity.Sclass;
import com.wjq.service.SclassService;
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
 * (Sclass)表控制层
 *
 * @author makejava
 * @since 2019-03-25 17:06:03
 */
@Controller
public class SclassController {
    /**
     * 服务对象
     */
    @Resource
    private SclassService sclassService;
    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Sclass selectOne(Integer id) {
        return this.sclassService.queryById(id);
    }

    @GetMapping("sclass.do")
    public  String listPage(@RequestParam(required = false,defaultValue = "1",value = "pageNo")Integer pageNo,HttpServletRequest request){
//       log.info("------pageHelper");
        PageHelper.startPage(pageNo,5);
        List<Sclass> list=sclassService.listPage();
        PageInfo pageInfo = new PageInfo<>(list,5);
        request.setAttribute("content",list);
        request.setAttribute("pageInfo",pageInfo);
        return "listClass";

    }
    @RequestMapping("/createSc.do")
    @ResponseBody
    public Map<String,Object> creatSc(Sclass sclass){
        Map<String,Object> map=new HashMap<>();
//        String sid= Integer.valueOf(Math.random());
        System.out.print(sclass);
        String sclastdate= df.format(new Date());
//        Date date=df.format(new Date());
//        sclass.setSid(sid);
        sclass.setSclastdate(sclastdate);
        int k=sclassService.createSc(sclass);
        if(k!=0){

            map.put("message",true);
        }else{
            map.put("message",false);
        }

        return map;
    }
    @RequestMapping("deleteSc.do")
    @ResponseBody
     public Map<String,Object> deleteSc(@RequestParam(value = "scid")String scid){
         Map<String,Object> map=new HashMap<>();
         int k=sclassService.deleteSc(scid);
        if(k!=0){
            map.put("message",true);
        }else{
            map.put("message",false);
        }
        return map;


     }
     @GetMapping("selectById.do")
     public  String    selectById(String scid,HttpServletRequest request){
            Sclass sclass=sclassService.selectById(scid);
        request.setAttribute("scl",sclass);
        return "editClass";
     }

    @RequestMapping("editSc.do")
    @ResponseBody
    public Map<String,Object> editSc(Sclass sclass){
        Map<String,Object> map=new HashMap<>();
//        String date= df.format(new Date());
       sclass.setSclastdate(df.format(new Date()));
        int e=sclassService.editSc(sclass);
        if(e!=0){
            map.put("message",true);
        }else{
            map.put("message",false);
        }
        return map;


    }







}