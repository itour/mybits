package com.mybits.datasource;

/**
 * Created by Ray on 2017/8/16.
 */
public class DBContextHolder {
    /**
     * 线程threadlocal
     */
    private static ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static  String DB_TYPE_RW = "dataSourceKeyRW";
    public static  String DB_TYPE_R = "dataSourceKeyR";

    public static String getDbType() {
        String db = contextHolder.get();
        if (db == null) {
            db = DB_TYPE_RW;// 默认是读写库
        }
        return db;
    }
    public static void setDbType(String str) {
        contextHolder.set(str);
    }
    public static void clearDBType() {
        contextHolder.remove();
    }
}
