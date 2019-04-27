package com.bobo.nocos.spring.config.config;

import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.ToStringSerializer;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import org.springframework.stereotype.Component;

/**
 * fastjosn配置
 * @create 2019-01-12 10:32
 **/
@Component
public class FastJsonConfiguration extends FastJsonConfig {
    public FastJsonConfiguration () {
        super();
        SerializeConfig serializeConfig = SerializeConfig.globalInstance;
        serializeConfig.put(Long.class,ToStringSerializer.instance);
        serializeConfig.put(Long.TYPE, ToStringSerializer.instance);
        this.setSerializeConfig(serializeConfig);
    }
}
