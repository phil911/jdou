package com.rosegun.commons.spider;

import java.io.IOException;
import java.net.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by fei.zheng on 2015/11/22 0022.
 */
public class SimpleCrawler extends Crawler {
    private final static Logger logger = LoggerFactory.getLogger(SimpleCrawler.class);

    @Override
    public CrawlResult crawl(CrawlRequest request) {
        CrawlResult result = new CrawlResult();
        URL url = null;
        try {
            url = new URL(request.getUrl());
        } catch (MalformedURLException e) {
            logger.error("Failed to construct url from string:" + request.getUrl(), e);
            result.setDesc(e.getMessage());
            return result;
        } catch (NullPointerException e) {
            logger.error("Http(s) request url is null.", e);
            result.setDesc(e.getMessage());
            return result;
        }

        HttpURLConnection conn = null;

        try {
            if (request.getProxy() != null) {
                conn =(HttpURLConnection) url.openConnection(request.getProxy());
            } else {
                conn =(HttpURLConnection) url.openConnection();
            }
        } catch (IOException e) {
            logger.error("Failed to connect to url:"+request.getUrl(), e);
            result.setDesc(e.getMessage());
            return result;
        }

        try {
            conn.setRequestMethod(request.getMethod().toString());
        } catch (ProtocolException e) {
            logger.error("Failed connect to url:"+request.getUrl()+" when set method:"+request.getMethod(), e);
            result.setDesc(e.getMessage());
            return result;
        }


        return result;
    }
}
