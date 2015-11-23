package com.rosegun.commons.spider;

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

    public static enum PROTOCOL {
        HTTP("http"), HTTPS("https"), FTP("ftp");
        private String protocal;

        private PROTOCOL(String protocal) {
            this.protocal = protocal;
        }
    }

    private METHOD method;
    private String query;
    private String path;
    private String host;
    private int port;
    private PROTOCOL protocol;
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

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PROTOCOL getProtocol() {
        return protocol;
    }

    public void setProtocol(PROTOCOL protocol) {
        this.protocol = protocol;
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

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
