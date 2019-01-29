package com.leyou.commom.advice;

import com.leyou.commom.enums.ExceptionEnum;
import com.leyou.commom.exception.LyException;
import com.leyou.commom.vo.ExceptionResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//可以拦截所有的contrller
@ControllerAdvice
public class CommonExceptionHandler {

    //LyException.class类型的异常
    @ExceptionHandler(LyException.class)
    public ResponseEntity<ExceptionResult> handleException(LyException e){
        return ResponseEntity.status(e.getExceptionEnum().getCode())
                .body(new ExceptionResult(e.getExceptionEnum()));
    }
}
