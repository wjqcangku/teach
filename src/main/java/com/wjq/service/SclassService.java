package com.wjq.service;

import com.wjq.entity.Sclass;
import java.util.List;

/**
 * (Sclass)表服务接口
 *
 * @author makejava
 * @since 2019-03-25 17:06:03
 */
public interface SclassService {

    /**
     * 通过ID查询单条数据
     *
     * @param scid 主键
     * @return 实例对象
     */
    Sclass queryById(Integer scid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Sclass> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param sclass 实例对象
     * @return 实例对象
     */
    Sclass insert(Sclass sclass);

    /**
     * 修改数据
     *
     * @param sclass 实例对象
     * @return 实例对象
     */
    Sclass update(Sclass sclass);

    /**
     * 通过主键删除数据
     *
     * @param scid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer scid);


    int  createSc(Sclass sclass);//新增
    int  deleteSc(String scid);//删除
    List<Sclass> listPage();//查询
    int editSc(Sclass sclass);//修改
    Sclass  selectById(String scid);//修改时查询回显

}