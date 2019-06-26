package com.heyang.rabbitmq.receiver;

import com.heyang.client.MallStreamClient;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(MallStreamClient.class)
public class StreamReceiver {  //消息接受类

    @StreamListener("inputMessage")  //监听testMessage这个消息队列, StreamClient类中必须定义相应的Input。
    public void receiver(Object message) {
        System.out.println("接收到消息：" + message);
    }
}
