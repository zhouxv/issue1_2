package com.issue1.demo.service.entityServiceImpl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.issue1.demo.entity.SagLevel;
import com.issue1.demo.mapper.SagLevelMapper;
import com.issue1.demo.service.entityService.ISagLevelService;
import com.issue1.dependence.common.entity.QueryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *  Service实现
 *
 * @author zhouxv
 */
@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SagLevelServiceImpl extends ServiceImpl<SagLevelMapper, SagLevel> implements ISagLevelService {

    private final SagLevelMapper sagLevelMapper;

    @Override
    public IPage<SagLevel> findSagLevels(QueryRequest request, SagLevel sagLevel) {
        LambdaQueryWrapper<SagLevel> queryWrapper = new LambdaQueryWrapper<>();
        // TODO 设置查询条件
        Page<SagLevel> page = new Page<>(request.getPageNum(), request.getPageSize());
        return this.page(page, queryWrapper);
    }

    @Override
    public List<SagLevel> findSagLevels(SagLevel sagLevel) {
        LambdaQueryWrapper<SagLevel> queryWrapper = new LambdaQueryWrapper<>();
        //按servieceId索引
        if (sagLevel.getServiceid() != null) queryWrapper.eq(SagLevel::getServiceid, sagLevel.getServiceid());
        return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    public SagLevel findOneSagLevel(Integer serviceId) {
        LambdaQueryWrapper<SagLevel> queryWrapper = new LambdaQueryWrapper<>();
        //按servieceId索引
        queryWrapper.eq(SagLevel::getServiceid, serviceId);
        return this.baseMapper.selectOne(queryWrapper);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean createSagLevel(SagLevel sagLevel) {
        sagLevel.setDeletestate(1);
        return this.save(sagLevel);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean updateSagLevel(SagLevel sagLevel) {
        return this.saveOrUpdate(sagLevel);
    }

    @Override
    public Boolean updateSagLevelByServiceId(SagLevel sagLevel) {
        LambdaUpdateWrapper<SagLevel> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(SagLevel::getServiceid, sagLevel.getServiceid());
        return this.update(sagLevel, wrapper);
    }

    @Override
    public Boolean deleteSagLevelById(Integer integer) {
        SagLevel sagLevel = new SagLevel();
        sagLevel.setDeletestate(0);

        LambdaUpdateWrapper<SagLevel> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(SagLevel::getServiceid, integer);

        return this.update(sagLevel, wrapper);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Boolean deleteSagLevel(SagLevel sagLevel) {
        LambdaQueryWrapper<SagLevel> wrapper = new LambdaQueryWrapper<>();
	    // TODO 设置删除条件
	    return this.remove(wrapper);
	}
}
