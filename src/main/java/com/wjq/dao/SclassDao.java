package com.wjq.dao;

import com.wjq.entity.Sclass;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Sclass)表数据库访问层
 *
 * @author makejava
 * @since 2019-03-25 17:06:02
 */
public interface SclassDao {

    /**
     * 通过ID查询单条数据
     *
     * @param scid 主键
     * @return 实例对象
     */
    Sclass queryById(Integer scid);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sclass> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param sclass 实例对象
     * @return 对象列表
     */
    List<Sclass> queryAll(Sclass sclass);

    /**
     * 新增数据
     *
     * @param sclass 实例对象
     * @return 影响行数
     */
    int insert(Sclass sclass);

    /**
     * 修改数据
     *
     * @param sclass 实例对象
     * @return 影响行数
     */
    int update(Sclass sclass);

    /**
     * 通过主键删除数据
     *
     * @param scid 主键
     * @return 影响行数
     */
    int deleteById(Integer scid);



    int  createSc(Sclass sclass);//新增
    int  deleteSc(String scid);//删除
    List<Sclass> listPage();//查询
    int editSc(Sclass sclass);//修改
    Sclass  selectById(String scid);//修改时查询回显










}