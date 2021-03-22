package com.geely.seckillsystem.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  //无参构造
@AllArgsConstructor //全参构造
public class JSonRespBean {

    private long code;
    private String message;
    private Object obj;

    /**
     * 功能描述：成功的返回结果
     *
     * @author QiShun.Zhou
     * @return com.geely.seckillsystem.vo.JSonRespBean
     * @date 2021/3/15 17:12
     */
    public static JSonRespBean success() {
        return new JSonRespBean(JSonRespBeanEnum.SUCCESS.getCode(), JSonRespBeanEnum.SUCCESS.getMessage(), null);
    }

    /**
     * 功能描述：成功的返回结果
     *
     * @author QiShun.Zhou
     * @return com.geely.seckillsystem.vo.JSonRespBean
     * @date 2021/3/15 17:12
     */
    public static JSonRespBean success(Object obj) {
        return new JSonRespBean(JSonRespBeanEnum.SUCCESS.getCode(), JSonRespBeanEnum.SUCCESS.getMessage(), obj);
    }

    /**
     * 功能描述：失败的返回结果
     *
     * @author QiShun.Zhou
     * @return JSonRespBean
     * @date 2021/3/15 14:12
     */
    public static JSonRespBean error(JSonRespBeanEnum jSonRespBeanEnum) {
        return new JSonRespBean(jSonRespBeanEnum.getCode(), jSonRespBeanEnum.getMessage(), null);
    }

    /**
     * 功能描述：失败的返回结果
     * 
     * @author QiShun.Zhou
     * @return JSonRespBean
     * @date 2021/3/15 17:12
     */
    public static JSonRespBean error(JSonRespBeanEnum jSonRespBeanEnum, Object obj) {
        return new JSonRespBean(jSonRespBeanEnum.getCode(), jSonRespBeanEnum.getMessage(), obj);
    }

}
