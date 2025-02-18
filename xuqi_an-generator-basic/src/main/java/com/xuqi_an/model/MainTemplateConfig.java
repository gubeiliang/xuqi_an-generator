package com.xuqi_an.model;

import lombok.Data;

/**
 * 静态模板配置
 */
@Data


public class MainTemplateConfig {

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author;

    /**
     * 输出信息
     */
    private String outputText;
}
