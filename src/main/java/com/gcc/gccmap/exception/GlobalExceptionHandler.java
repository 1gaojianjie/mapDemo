package com.gcc.gccmap.exception;

import com.gcc.gccmap.enums.ResponseStatus;
import com.gcc.gccmap.util.ResponseResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalTokenException.class)
    public ResponseResult illegalTokenExceptionHandler(IllegalTokenException ex){
        return new ResponseResult(ResponseStatus.TOKEN_ERROR.getCode(),ex.getMessage());
    }

    @ExceptionHandler(PasswordErrorException.class)
    public ResponseResult passwordErrorExceptionHandler(){
        return new ResponseResult(ResponseStatus.PASSWORD_ERROR.getCode(),ResponseStatus.PASSWORD_ERROR.getMessage());
    }

    @ExceptionHandler(UserNotExistException.class)
    public ResponseResult userNotExistExceptionHandler(UserNotExistException ex){
        return new ResponseResult(ResponseStatus.USER_NOT_FOUND.getCode(),ex.getMessage());
    }

    @ExceptionHandler(UserNotLoggedException.class)
    public ResponseResult userNotLoggedExceptionHandler(){
        return new ResponseResult(ResponseStatus.USER_NOT_LOGGED.getCode(),ResponseStatus.USER_NOT_LOGGED.getMessage());
    }

    @ExceptionHandler(EmailExistException.class)
    public ResponseResult emailExistException(){
        return new ResponseResult(ResponseStatus.USER_EMAIL_EXIST.getCode(), ResponseStatus.USER_EMAIL_EXIST.getMessage());
    }

    @ExceptionHandler(CodeTimeoutException.class)
    public ResponseResult codeTimeoutException(){
        return new ResponseResult(ResponseStatus.USER_VCODE_TIMEOUT.getCode(),ResponseStatus.USER_VCODE_TIMEOUT.getMessage());
    }

    @ExceptionHandler(VerificationCodeErrorException.class)
    public ResponseResult VerificationCodeErrorExceptionHandler(){
        return new ResponseResult(ResponseStatus.USER_VCODE_ERROR.getCode(),ResponseStatus.USER_VCODE_ERROR.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseResult handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        Map<String, Object> map = new HashMap<>();
        List<String> list = new LinkedList<>();
        result.getFieldErrors().forEach(error -> {
            String field = error.getField();
            Object value = error.getRejectedValue();
            String msg = error.getDefaultMessage();
            list.add(String.format("错误字段 -> %s 错误值 -> %s 原因 -> %s", field, value, msg));
        });
        map.put("msg", list);
        return new ResponseResult(ResponseStatus.PARM_ERROR.getCode(),ResponseStatus.PARM_ERROR.getMessage(),map);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseResult constraintViolationException(ConstraintViolationException e){

        return new ResponseResult(ResponseStatus.PARM_ERROR.getCode(),e.getMessage());
    }

    @ExceptionHandler(EmailNotExistException.class)
    public ResponseResult emailNotExistException(){
        return new ResponseResult(ResponseStatus.USER_EMAIL_NOT_EXIST.getCode(), ResponseStatus.USER_EMAIL_NOT_EXIST.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseResult error(Exception ex){
        return new ResponseResult(ResponseStatus.FAIL.getCode(), ex.getMessage());
    }

    @ExceptionHandler(CanteenNotExistException.class)
    public ResponseResult error(CanteenNotExistException ex){
        return new ResponseResult(ResponseStatus.FAIL.getCode(), ex.getMessage());
    }

    @ExceptionHandler(BuildingNotExistException.class)
    public ResponseResult error(BuildingNotExistException ex){
        return new ResponseResult(ResponseStatus.FAIL.getCode(), ex.getMessage());
    }
}
