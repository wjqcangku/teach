package com.wjq.service.impl;

import com.wjq.entity.Graduation;
import com.wjq.dao.GraduationDao;
import com.wjq.entity.Teacher;
import com.wjq.service.GraduationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Graduation)表服务实现类
 *
 * @author makejava
 * @since 2019-04-09 14:50:42
 */
@Service("graduationService")
public class GraduationServiceImpl implements GraduationService {
    @Resource
    private GraduationDao graduationDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Graduation queryById(Integer id) {
        return this.graduationDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Graduation> queryAllByLimit(int offset, int limit) {
        return this.graduationDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param graduation 实例对象
     * @return 实例对象
     */
    @Override
    public Graduation insert(Graduation graduation) {
        this.graduationDao.insert(graduation);
        return graduation;
    }

    /**
     * 修改数据
     *
     * @param graduation 实例对象
     * @return 实例对象
     */
    @Override
    public Graduation update(Graduation graduation) {
        this.graduationDao.update(graduation);
        return this.queryById(graduation.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.graduationDao.deleteById(id) > 0;
    }

    @Override
    public List<Graduation> querryAll(Graduation graduation) {
        return this.graduationDao.queryAll(graduation);
    }
}