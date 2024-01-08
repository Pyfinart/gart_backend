package com.gart.gartbackend.sys.service;

import com.gart.gartbackend.sys.dto.Result;
import com.gart.gartbackend.sys.entity.Collections;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
public interface ICollectionsService extends IService<Collections> {

    Result getCollectionListByPage(Integer pageId);
}
