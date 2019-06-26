package com.heyang.common.base;

/**
 * @ProjectName: mall-heyang
 * @Package: com.heyang.common.base
 * @Description: java类作用描述
 * @Author: heyang
 * @CreateDate: 2019/6/23 18:39
 */
public interface MallSendMsg<T> {

    void OnMessageSend(T t);

}
