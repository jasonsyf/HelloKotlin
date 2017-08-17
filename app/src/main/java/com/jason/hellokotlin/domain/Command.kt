package com.jason.hellokotlin.domain

/**
 * Created by jason_sunyf on 2017/8/8.
 * Email:yufeng.sun@21wendao.cn
 */
public interface Command<T> {

    fun execute(): T

}