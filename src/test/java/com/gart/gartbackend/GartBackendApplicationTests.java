package com.gart.gartbackend;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Types;
import java.util.Collections;

@SpringBootTest
class GartBackendApplicationTests {

    @Test
    void contextLoads() {
        String s = "你好";
        System.out.println(s.charAt(0));
    }

    @Test
    void mybatisPlusGenerator() {

        String url = "jdbc:mysql://127.0.0.1:3306/g_art?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&characterEncoding=utf-8";
        String username = "root";
        String password = "12345678";
        String moduleName = "sys";
        String mapperPath = "/Users/yhj19/developer/MY_Java/gart-backend/src/main/resources/mapper/"+moduleName;
        String tableNames = "tb_activity,tb_collections,tb_offer_prices,tb_offer_criteria,tb_offer_sources,tb_offer_fee_breakdown,tb_offers";

        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("Levi") // 设置作者
                            // .enableSwagger() // 开启 swagger 模式
//                             .fileOverride() // 覆盖已生成文件
                            .outputDir("/Users/yhj19/developer/MY_Java/gart-backend/src/main/java"); // 指定输出目录
                })
                .dataSourceConfig(builder -> builder.typeConvertHandler((globalConfig, typeRegistry, metaInfo) -> {
                    int typeCode = metaInfo.getJdbcType().TYPE_CODE;
                    if (typeCode == Types.SMALLINT) {
                        // 自定义类型转换
                        return DbColumnType.INTEGER;
                    }
                    return typeRegistry.getColumnType(metaInfo);

                }))
                .packageConfig(builder -> {
                    builder.parent("com.gart.gartbackend") // 设置父包名
                            .moduleName(moduleName) // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, mapperPath)); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tableNames) // 设置需要生成的表名
                            .addTablePrefix("tb_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
