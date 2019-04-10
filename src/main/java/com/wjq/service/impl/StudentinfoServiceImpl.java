package com.wjq.service.impl;

import com.wjq.entity.Graduation;
import com.wjq.entity.Studentinfo;
import com.wjq.dao.StudentinfoDao;
import com.wjq.entity.Teacher;
import com.wjq.service.StudentinfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Studentinfo)表服务实现类
 *
 * @author makejava
 * @since 2019-04-08 15:18:30
 */
@Service("studentinfoService")
public class StudentinfoServiceImpl implements StudentinfoService {
    @Resource
    private StudentinfoDao studentinfoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Studentinfo queryById(Integer id) {
        return this.studentinfoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Studentinfo> queryAllByLimit(int offset, int limit) {
        return this.studentinfoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param studentinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Studentinfo insert(Studentinfo studentinfo) {
        this.studentinfoDao.insert(studentinfo);
        return studentinfo;
    }

    @Override
    public Graduation insertgra(Graduation graduation) {
        this.studentinfoDao.insertgra(graduation);
        return graduation;
    }

    /**
     * 修改数据
     *
     * @param studentinfo 实例对象
     * @return 实例对象
     */
    @Override
    public Studentinfo update(Studentinfo studentinfo) {
        this.studentinfoDao.update(studentinfo);
        return this.queryById(studentinfo.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.studentinfoDao.deleteById(id) > 0;
    }


    @Override
    public List<Studentinfo> querryAll(Studentinfo studentinfo) {
        return this.studentinfoDao.queryAll(studentinfo);
    }
}