package com.wjq.service;

import com.wjq.entity.Graduation;
import com.wjq.entity.Teacher;

import java.util.List;

/**
 * (Graduation)表服务接口
 *
 * @author makejava
 * @since 2019-04-09 14:50:41
 */
public interface GraduationService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Graduation queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Graduation> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param graduation 实例对象
     * @return 实例对象
     */
    Graduation insert(Graduation graduation);

    /**
     * 修改数据
     *
     * @param graduation 实例对象
     * @return 实例对象
     */
    Graduation update(Graduation graduation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);
    List<Graduation> querryAll(Graduation graduation);

}