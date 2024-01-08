package com.gart.gartbackend.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gart.gartbackend.sys.dto.Result;
import com.gart.gartbackend.sys.entity.Collections;
import com.gart.gartbackend.sys.mapper.CollectionsMapper;
import com.gart.gartbackend.sys.service.ICollectionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@Service
public class CollectionsServiceImpl extends ServiceImpl<CollectionsMapper, Collections> implements ICollectionsService {

    @Resource
    CollectionsMapper collectionsMapper;

    @Override
    public Result getCollectionListByPage(Integer pageId) {
        Page<Collections> page = new Page<>(pageId - 1, 10);
        QueryWrapper<Collections> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("`name`");
        List<Collections> collections = collectionsMapper.selectPage(page, queryWrapper).getRecords();
        if (collections != null && collections.size() != 0)
            return Result.ok(collections);
        else
            return Result.fail("page参数有误，或者该页无数据");
    }
}
