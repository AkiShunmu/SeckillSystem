package com.geely.seckillsystem.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor //全参构造
public enum JSonRespBeanEnum {

    SUCCESS(200, "SUCCESS"),

    ERROR(500,"服务器异常"),

    ;

    //状态码
    private final Integer code;
    //信息提示文
    private final String message;

}
