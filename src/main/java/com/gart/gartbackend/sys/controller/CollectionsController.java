package com.gart.gartbackend.sys.controller;

import com.gart.gartbackend.sys.dto.Result;
import com.gart.gartbackend.sys.service.ICollectionsService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@Controller
@RequestMapping("/sys/collections")
public class CollectionsController {

    @Resource
    private ICollectionsService collectionsService;

    @GetMapping("/{pageId}")
    public Result getCollectionList(@PathVariable Integer pageId){
        Result res = collectionsService.getCollectionListByPage(pageId);
        return res;
    }

}
