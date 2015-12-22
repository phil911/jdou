package com.rosegun.commons.spider;

/**
 * Created by think on 2015/12/22 0022.
 */
public class CrawlResult {
    private int code;
    private String desc;
    private String error="";
    public CrawlResult(){
        this.code=-1;
        this.desc="unknow error occors.";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
