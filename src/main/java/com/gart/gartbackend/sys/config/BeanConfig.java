package com.gart.gartbackend.sys.config;

import com.gart.gartbackend.sys.utils.constants.FrontConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean("frontConstants")
    public FrontConstants frontConstants(){
        return new FrontConstants();
    }

}
