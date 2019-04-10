package com.wjq.dao;

import com.wjq.entity.Curriculum;
import com.wjq.entity.Sclass;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Curriculum)表数据库访问层
 *
 * @author makejava
 * @since 2019-03-25 17:08:23
 */
public interface CurriculumDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Curriculum queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Curriculum> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param curriculum 实例对象
     * @return 对象列表
     */
    List<Curriculum> queryAll(Curriculum curriculum);

    /**
     * 新增数据
     *
     * @param curriculum 实例对象
     * @return 影响行数
     */
    int insert(Curriculum curriculum);

    /**
     * 修改数据
     *
     * @param curriculum 实例对象
     * @return 影响行数
     */
    int update(Curriculum curriculum);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);


    List<Curriculum> listPage();//查询

}