package com.bobo.nocosdubboproducer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.bobo.nacos.dubbo.api.NacosDubboIface;
import org.springframework.beans.factory.annotation.Value;


/**
 * @create 2019-01-22 12:25
 **/
@Service(version = "${demo.service.version}")
public class NacosService implements NacosDubboIface {

    @Value("${demo.service.name}")
    private String serviceName;

    @Override
    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                name,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
