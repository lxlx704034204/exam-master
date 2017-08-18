package com.lsc.exam.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/2.
 */
public class SessionUtil {
    /**
     * 往session中存放信息
     *
     * @param request
     * @param key
     * @param value
     */
    public static void setAttribute(HttpServletRequest request,String key ,Object value){
        request.getSession(false).removeAttribute(key.toString());
        HttpSession session = request.getSession(true);
        session.setAttribute(key, value);
    }

    /**
     * 从session中获取信息
     *
     * @param request
     * @param key
     * @return
     */
    public static Object getAttribute(HttpServletRequest request,Serializable key){

        HttpSession session = request.getSession(false);

        return session.getAttribute(key.toString());
    }
    /**
     * 从session中删除信息
     *
     * @param request
     * @param key
     * @return
     */
    public static Boolean removeAttribute(HttpServletRequest request,Serializable key){

        HttpSession session = request.getSession(false);

        Object attribute = session.getAttribute(key.toString());
        if(attribute != null){
            session.removeAttribute(key.toString());
            return true;
        }
        return false;
    }

}
