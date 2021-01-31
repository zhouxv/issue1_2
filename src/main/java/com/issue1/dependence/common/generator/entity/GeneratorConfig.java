package com.issue1.dependence.common.generator.entity;

import com.issue1.dependence.common.utils.DateUtil;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author helit747@gmail.com
 * @date 2020/9/18 上午11:31
 * 模版对应类
 */
@Data
public class GeneratorConfig {

    public static final String TRIM_YES = "1";
    public static final String TRIM_NO = "0";

    private String generatorPackage;

    /**
     * 作者
     */
    private String author;

    /**
     * 基础包名
     */
    private String basePackage;

    /**
     * entity文件存放路径
     */
    private String entityPackage;

    /**
     * mapper文件存放路径
     */
    private String mapperPackage;

    /**
     * mapper xml文件存放路径
     */
    private String mapperXmlPackage;

    /**
     * servcie文件存放路径
     */
    private String servicePackage;

    /**
     * serviceImpl文件存放路径
     */
    private String serviceImplPackage;

    /**
     * controller文件存放路径
     */
    private String controllerPackage;


    /**
     * java文件路径，固定值
     */
    private transient String javaPath = "src/main/java";
    /**
     * 配置文件存放路径，固定值
     */
    private transient String resourcesPath = "src/main/resources";
    /**
     * 文件生成日期
     */
    private transient String date = DateUtil.formatFullTime(LocalDateTime.now(), DateUtil.FULL_TIME_SPLIT_PATTERN);

    /**
     * 表名
     */
    private transient String tableName;
    /**
     * 表注释
     */
    private transient String tableComment;
    /**
     * 数据表对应的类名
     */
    private transient String className;

}
