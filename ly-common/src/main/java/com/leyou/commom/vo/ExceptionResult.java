package com.leyou.commom.vo;

import com.leyou.commom.enums.ExceptionEnum;
import lombok.Data;
@Data
//组装一个异常返回body
public class ExceptionResult {
    private int status;
    private String message;
    private Long timestamp;

    public ExceptionResult(ExceptionEnum em){
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
