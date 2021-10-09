package com.lemndo.blog.base;



import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.engine.VelocityTemplateEngine;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeGenerator {
    /**
     * 执行初始化数据库脚本
     */
//    public static void before() throws SQLException {
//        Connection conn = DATA_SOURCE_CONFIG.build().getConn();
//        InputStream inputStream = CodeGenerator.class.getResourceAsStream("/sql/init.sql");
//        ScriptRunner scriptRunner = new ScriptRunner(conn);
//        scriptRunner.setAutoCommit(true);
//        scriptRunner.runScript(new InputStreamReader(inputStream));
//        conn.close();
//    }

    /**
     * 数据源配置
     */
//    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
//            .Builder("jdbc:mysql:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE;CASE_INSENSITIVE_IDENTIFIERS=TRUE;MODE=MYSQL", "root", "1832580");

    /**
     * 执行 run
     */
    public static void main(String[] args) throws SQLException {
//        before();
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/blog", "root", "1832580")
                .globalConfig(builder -> {
                    builder.author("lemndo") // 设置作者
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\My_Java\\blog\\blog-api\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.lemndo.blog") // 设置父包名
//                            .moduleName("blog-api")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "E:\\My_Java\\blog\\blog-api\\src\\main\\resources\\com.lemndo.blog.mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ms_category") // 设置需要生成的表名
                            .addTablePrefix("ms_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}

