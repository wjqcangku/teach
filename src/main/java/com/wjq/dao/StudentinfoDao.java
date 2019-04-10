package com.wjq.dao;

import com.wjq.entity.Graduation;
import com.wjq.entity.Studentinfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Studentinfo)表数据库访问层
 *
 * @author makejava
 * @since 2019-04-08 15:18:30
 */
public interface StudentinfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Studentinfo queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Studentinfo> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param studentinfo 实例对象
     * @return 对象列表
     */
    List<Studentinfo> queryAll(Studentinfo studentinfo);

    /**
     * 新增数据
     *
     * @param studentinfo 实例对象
     * @return 影响行数
     */
    int insert(Studentinfo studentinfo);



    //当改变状态为已经就业时新增数据到毕业情况表里面
    int insertgra(Graduation graduation);

    /**
     * 修改数据
     *
     * @param studentinfo 实例对象
     * @return 影响行数
     */
    int update(Studentinfo studentinfo);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}