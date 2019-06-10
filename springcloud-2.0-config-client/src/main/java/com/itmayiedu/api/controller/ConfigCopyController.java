package com.itmayiedu.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-23 下午 5:21
 */
//@RefreshScope
@RestController
public class ConfigCopyController {
    @Value("${swagger2}")
    private String gitServerName;

    @RequestMapping("/getServerName2")
    public String getItmayieduinfo(){
        return gitServerName;
    }
}
