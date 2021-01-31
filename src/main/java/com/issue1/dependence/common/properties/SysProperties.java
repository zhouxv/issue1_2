package com.issue1.dependence.common.properties;

import com.issue1.dependence.common.generator.entity.GeneratorConfig;
import lombok.Data;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author helit747@gmail.com
 */
@SpringBootConfiguration
@EnableAsync
@PropertySource(value = {"classpath:system.properties"})// 注意,只能从.properts文件取值,yml不行
@ConfigurationProperties(prefix = "sys") //从全局配置文件取值
@Data
public class SysProperties {
    private Integer aa;
    private GeneratorConfig generator;
}
