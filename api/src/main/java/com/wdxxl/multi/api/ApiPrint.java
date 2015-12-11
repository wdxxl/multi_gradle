package com.wdxxl.multi.api;

import com.wdxxl.multi.common.CommonPrint;

import org.apache.log4j.Logger;

public class ApiPrint {
    private static final Logger LOGGER = Logger.getLogger(ApiPrint.class);

    public void outputApi() {
        System.out.println("Print Api");
        CommonPrint commonPrint = new CommonPrint();
        System.out.println("== Api Call " + commonPrint.outputCommon());
    }

}
