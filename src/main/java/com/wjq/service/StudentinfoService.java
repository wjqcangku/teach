package com.wjq.service;

import com.wjq.entity.Graduation;
import com.wjq.entity.Studentinfo;
import com.wjq.entity.Teacher;

import java.util.List;

/**
 * (Studentinfo)表服务接口
 *
 * @author makejava
 * @since 2019-04-08 15:18:30
 */
public interface StudentinfoService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Studentinfo queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Studentinfo> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param studentinfo 实例对象
     * @return 实例对象
     */
    Studentinfo insert(Studentinfo studentinfo);

    Graduation insertgra(Graduation graduation);

    /**
     * 修改数据
     *
     * @param studentinfo 实例对象
     * @return 实例对象
     */
    Studentinfo update(Studentinfo studentinfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    List<Studentinfo> querryAll(Studentinfo studentinfo);

}