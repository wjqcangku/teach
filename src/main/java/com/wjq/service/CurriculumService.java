package com.wjq.service;

import com.wjq.entity.Curriculum;
import java.util.List;

/**
 * (Curriculum)表服务接口
 *
 * @author makejava
 * @since 2019-03-25 17:08:24
 */
public interface CurriculumService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Curriculum queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Curriculum> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param curriculum 实例对象
     * @return 实例对象
     */
    Curriculum insert(Curriculum curriculum);

    /**
     * 修改数据
     *
     * @param curriculum 实例对象
     * @return 实例对象
     */
    Curriculum update(Curriculum curriculum);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);


     List<Curriculum> queryAll(Curriculum curriculum);

     List<Curriculum> listpage();//分页查询



}