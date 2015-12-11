package com.wdxxl.multi.app;

import com.wdxxl.multi.api.ApiPrint;
import com.wdxxl.multi.common.CommonPrint;

public class AppPrint {

    public static void main(String[] args) {
        ApiPrint apiPrint = new ApiPrint();
        apiPrint.outputApi();

        CommonPrint commonPrint = new CommonPrint();
        System.out.println("== App Call " + commonPrint.outputCommon());
    }

}
