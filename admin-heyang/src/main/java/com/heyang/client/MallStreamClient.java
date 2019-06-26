package com.heyang.client;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @ProjectName: mall-heyang
 * @Package: com.heyang.client
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/23 18:35
 */
public interface MallStreamClient {
    @Input("inputMessage")
    SubscribableChannel input();  //用于接受消息

    @Output("outputMessage")
    MessageChannel output();  //用于发送消息
}
