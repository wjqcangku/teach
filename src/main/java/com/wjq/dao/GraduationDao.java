package com.wjq.dao;

import com.wjq.entity.Graduation;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Graduation)表数据库访问层
 *
 * @author makejava
 * @since 2019-04-09 14:50:41
 */
public interface GraduationDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Graduation queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Graduation> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param graduation 实例对象
     * @return 对象列表
     */
    List<Graduation> queryAll(Graduation graduation);

    /**
     * 新增数据
     *
     * @param graduation 实例对象
     * @return 影响行数
     */
    int insert(Graduation graduation);



    /**
     * 修改数据
     *
     * @param graduation 实例对象
     * @return 影响行数
     */
    int update(Graduation graduation);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}