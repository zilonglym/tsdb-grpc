package com.zhaoyuan.config;

import io.grpc.CallCredentials;
import net.devh.boot.grpc.client.security.CallCredentialsHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class TSReaderSecurityConfiguration {

    /**
     * 实现基本验证
     * JWT验证类似，参考 https://blog.csdn.net/yztezhl/article/details/130066012
     * @return
     */
    @Bean
    CallCredentials grpcCredentials() {
        // Create credentials for username + password.
        return CallCredentialsHelper.basicAuth("tsreader-account1", "tsreader-account1Password");
    }


}
