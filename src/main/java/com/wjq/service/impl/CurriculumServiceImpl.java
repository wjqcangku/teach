package com.wjq.service.impl;

import com.wjq.entity.Curriculum;
import com.wjq.dao.CurriculumDao;
import com.wjq.service.CurriculumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Curriculum)表服务实现类
 *
 * @author makejava
 * @since 2019-03-25 17:08:24
 */
@Service("curriculumService")
public class CurriculumServiceImpl implements CurriculumService {
    @Resource
    private CurriculumDao curriculumDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Curriculum queryById(Integer id) {
        return this.curriculumDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Curriculum> queryAllByLimit(int offset, int limit) {
        return this.curriculumDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param curriculum 实例对象
     * @return 实例对象
     */
    @Override
    public Curriculum insert(Curriculum curriculum) {
        this.curriculumDao.insert(curriculum);
        return curriculum;
    }

    /**
     * 修改数据
     *
     * @param curriculum 实例对象
     * @return 实例对象
     */
    @Override
    public Curriculum update(Curriculum curriculum) {
        this.curriculumDao.update(curriculum);
        return this.queryById(curriculum.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.curriculumDao.deleteById(id) > 0;
    }


    public List<Curriculum> queryAll(Curriculum curriculum){

     return this.curriculumDao.queryAll(curriculum);

    }

    public List<Curriculum> listpage(){

        return this.curriculumDao.listPage();

    }


}