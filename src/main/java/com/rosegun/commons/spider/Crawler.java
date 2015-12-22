package com.rosegun.commons.spider;

import java.util.UUID;

/**
 * Created by fei.zheng on 2015/11/22 0022.
 */
public abstract class Crawler {
    private String name;
    public Crawler(String name){
        this.name = name;
    }
    public Crawler(){
        this.name = this.getClass().getName()+":"+ UUID.randomUUID().toString();
    }

    public abstract CrawlResult crawl(CrawlRequest request);

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
