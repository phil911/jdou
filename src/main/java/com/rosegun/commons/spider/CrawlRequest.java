package com.rosegun.commons.spider;

import java.net.Proxy;
import java.util.Map;

/**
 * Created by fei.zheng on 2015/11/22 0022.
 */
public class CrawlRequest<T> {
    public static enum METHOD {
        GET("GET"), POST("POST");
        private String method;

        private METHOD(String method) {
            this.method = method;
        }
    }

    private Proxy proxy;
    private METHOD method;
    private Map<String, String> headers;
    private String url;
    private T data;

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

    public METHOD getMethod() {
        return method;
    }

    public void setMethod(METHOD method) {
        this.method = method;
    }


    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }
}
