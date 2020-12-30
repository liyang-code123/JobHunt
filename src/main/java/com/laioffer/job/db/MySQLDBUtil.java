package com.laioffer.job.db;

import com.laioffer.job.Secret;

public class MySQLDBUtil {
    private static final String INSTANCE = Secret.INSTANCE;
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = Secret.DBNAME;
    private static final String USERNAME = "admin";
    private static final String PASSWORD = Secret.PASSWORD;
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";

}