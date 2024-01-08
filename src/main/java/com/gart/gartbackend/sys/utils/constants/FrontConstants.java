package com.gart.gartbackend.sys.utils.constants;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 存储与前端交互相关的参数
 */
@Component
@ConfigurationProperties(prefix = "front.constants")
public class FrontConstants {

    public static int COLLECTION_PAGE_SIZE;

}
