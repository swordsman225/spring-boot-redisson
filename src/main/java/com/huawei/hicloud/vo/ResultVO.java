package com.huawei.hicloud.vo;

import com.huawei.hicloud.constants.ResultCode;

import java.io.Serializable;

/**
 * Result value object.
 * @author JiaxuYan
 * @since 2019-4-17 21:10:59
 */
public class ResultVO<T> implements Serializable {

    /**
     * See ResultCode.
     */
    private String code;

    private String msg;

    private String status;

    private T data;

    public ResultVO() {
    }

    public static <T> ResultVO<T> success(T data) {
        Builder<T> builder = new Builder<>();
        ResultVO<T> resultVO = builder.code(ResultCode.STATUS_CODE_SUCCESS).msg("Execute sucess!").status("sucess").data(data).build();

        return resultVO;
    }

    private ResultVO(Builder<T> builder) {
        this.code = builder.code;
        this.msg = builder.msg;
        this.status = builder.status;
        this.data = builder.data;
    }

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    public static class Builder<T> {

        private String code;

        private String msg;

        private String status;

        private T data;

        public <T> ResultVO<T> build() {
            return new ResultVO(this);
        }

        public Builder<T> code(String code) {
            this.code = code;
            return this;
        }

        public Builder<T> msg(String msg) {
            this.msg = msg;
            return this;
        }

        public Builder<T> status(String status) {
            this.status = status;
            return this;
        }

        public Builder<T> data(T data) {
            this.data = data;
            return this;
        }

    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
