package com.domeastudio.dto.resultset;

/**
 * Created by domea on 16-4-10.
 */
public enum Code {
    mpg_10000,//底层类库错误（C++ java第三方库问题）
    mpg_30000,//业务逻辑层错误
    mpg_40000,//接口层错误
    mpg_20000,//数据库层错误
    mpg_5000//中间件层错误
}
