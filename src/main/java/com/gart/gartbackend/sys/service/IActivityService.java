package com.gart.gartbackend.sys.service;

import com.gart.gartbackend.sys.entity.Activity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
public interface IActivityService extends IService<Activity> {
    List<Activity> queryListByCollectionId(String collectionId);
}
