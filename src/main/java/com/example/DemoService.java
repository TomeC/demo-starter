package com.example;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @date: 2022/11/4 18:22
 * @author: wangkun
 */
@Service
public class DemoService {
    @Resource
    private HttpProperties httpProperties;
    public String getUrl() {
        return httpProperties.getUrl();
    }
}
