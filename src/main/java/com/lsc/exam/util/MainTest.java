package com.lsc.exam.util;

import com.alibaba.druid.pool.DruidDataSource;
import com.lsc.exam.base.BaseConstants;

import java.sql.*;

/**
 * Created by lx on 2017/8/10.
 */
public class MainTest {

    public static void main(String[] args) {

        passwordMD5Test("1", 0 , "123"); // C991872DBD4325F54856228340E51C8E

    }


    public static void passwordMD5Test(String profession, int cardNo, String password){
        //profession: 职位 1管理员 2教师 3学生,  cardNo:  salt
        System.out.println( "-test-0-: " + MD5Util.MD5(cardNo+password+ BaseConstants.MD5_PWD_KEY) );
    }



}
