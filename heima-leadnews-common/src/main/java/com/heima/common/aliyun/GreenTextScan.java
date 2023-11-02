package com.heima.common.aliyun;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "aliyun")
public class GreenTextScan {

    private String accessKeyId;
    private String secret;
    private String service1;

    public Map greeTextScan(String content) throws Exception {

        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("suggestion","pass");
        return resultMap;
    }

}