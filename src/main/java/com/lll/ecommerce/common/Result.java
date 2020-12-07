package com.lll.ecommerce.common;

import lombok.Data;

/**
 * @author luoling
 * @param <T>
 */
@Data
public class Result<T> {
    private String code;
    private String message;
    private boolean success;
    /**
     * 方法本来的返回值类型
     */
    private T data;

    public Result(String code, boolean success, String message, T data){
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public Result(){
    }

    public static <E> Result<E> wrapSuccessResult(E e){
        return new Result<>("200", true, "", e);
    }

    public static <E> Result<E> wrapSuccessResult(){
        return new Result<>("200", true, "", null);
    }

    public static <E> Result<E> wrapErrorResult(String code, String msg){
        return new Result<>(code, false, msg, null);
    }

}
