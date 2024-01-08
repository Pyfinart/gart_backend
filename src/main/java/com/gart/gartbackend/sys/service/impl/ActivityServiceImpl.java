package com.gart.gartbackend.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gart.gartbackend.sys.entity.Activity;
import com.gart.gartbackend.sys.mapper.ActivityMapper;
import com.gart.gartbackend.sys.service.IActivityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@Service
public class ActivityServiceImpl extends ServiceImpl<ActivityMapper, Activity> implements IActivityService {

    @Resource
    private ActivityMapper activityMapper;


    @Override
    public List<Activity> queryListByCollectionId(String collectionId) {
        QueryWrapper<Activity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("collection_id", collectionId);
        List<Activity> activityList = activityMapper.selectList(queryWrapper);
        return activityList;
    }
}
