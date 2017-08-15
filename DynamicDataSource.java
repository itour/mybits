package com.mybits.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by Ray on 2017/8/16.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        System.out.println("当前数据源为: "+DBContextHolder.getDbType());
        return DBContextHolder.getDbType();
    }

}
