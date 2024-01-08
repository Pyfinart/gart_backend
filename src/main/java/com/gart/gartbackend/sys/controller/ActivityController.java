package com.gart.gartbackend.sys.controller;

import com.gart.gartbackend.sys.dto.Result;
import com.gart.gartbackend.sys.entity.Activity;
import com.gart.gartbackend.sys.service.IActivityService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@Controller
@RequestMapping("/sys/activity")
public class ActivityController {

    @Resource
    private IActivityService iActivityService;

    @GetMapping("/{collectionId}")
    public Result getActivityList(@PathVariable String collectionId){
        List<Activity> res = iActivityService.queryListByCollectionId(collectionId);
        return Result.ok(res);
    }

}
