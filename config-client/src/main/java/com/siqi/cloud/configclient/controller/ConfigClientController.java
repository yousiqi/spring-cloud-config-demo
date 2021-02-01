package com.siqi.cloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 获取配置api
 *
 * @author 游四七
 * @date 2021/1/30
 */
@RestController
@RefreshScope
public class ConfigClientController {

    /**
     * 注入配置中心获取的配置
     */
    @Value("${config.info}")
    private String configInfo;

    /**
     * http://localhost:9001/configInfo
     */
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}