package com.wjq.service.impl;

import com.wjq.entity.Sclass;
import com.wjq.dao.SclassDao;
import com.wjq.service.SclassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Sclass)表服务实现类
 *
 * @author makejava
 * @since 2019-03-25 17:06:03
 */
@Service("sclassService")
public class SclassServiceImpl implements SclassService {
    @Resource
    private SclassDao sclassDao;

    /**
     * 通过ID查询单条数据
     *
     * @param scid 主键
     * @return 实例对象
     */
    @Override
    public Sclass queryById(Integer scid) {
        return this.sclassDao.queryById(scid);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Sclass> queryAllByLimit(int offset, int limit) {
        return this.sclassDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param sclass 实例对象
     * @return 实例对象
     */
    @Override
    public Sclass insert(Sclass sclass) {
        this.sclassDao.insert(sclass);
        return sclass;
    }

    /**
     * 修改数据
     *
     * @param sclass 实例对象
     * @return 实例对象
     */
    @Override
    public Sclass update(Sclass sclass) {
        this.sclassDao.update(sclass);
        return this.queryById(sclass.getScid());
    }

    /**
     * 通过主键删除数据
     *
     * @param scid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer scid) {
        return this.sclassDao.deleteById(scid) > 0;
    }

    public int createSc(Sclass sclass){

        return sclassDao.createSc(sclass);
    }
    public int deleteSc(String scid){

        return sclassDao.deleteSc(scid);
    }
    public int editSc(Sclass sclass){

        return sclassDao.editSc(sclass);
    }
    public List<Sclass> listPage(){

        return sclassDao.listPage();
    }

    public Sclass selectById(String scid){

        return sclassDao.selectById(scid);
    }
















}