package com.lsc.exam.Filter;

import com.lsc.exam.base.BaseConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/4/30.
 */
public class SessionFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // 不过滤的uri
        String[] noFilter = new String[]{"/images","/js", "/css", "/login/tologin", "/login/mainframe", "/user/exist","/user/checkPassword", "/signcode","index.jsp","swagger-ui.html","/webjars",
                "configuration","swagger-resources","v2"};
        // 请求的uri
        String uri = request.getRequestURI();
        // 是否过滤
        boolean doFilter = true;
        for(String s : noFilter){
            if(uri.indexOf(s) != -1){
                // 如果uri中包含不过滤的uri，则不进行过滤
                doFilter = false;
                break;
            }
        }
        if(doFilter){
            // 执行过滤
            // 从session中获取登录者实体
            Object obj = request.getSession().getAttribute(BaseConstants.SESSION_KEY_OBJ_USER_BEAN);
            if(null == obj){
                boolean isAjaxRequest = isAjaxRequest(request);
                if(isAjaxRequest){
                    response.setCharacterEncoding("UTF-8");
                    //401状态码，登录失效
                    response.sendError( HttpStatus.UNAUTHORIZED.value());
                    return;
                }
                // TODO: 2017/4/30 添加登陆失效重定向url
                response.sendRedirect("index.jsp");
                return;
            }else{
                filterChain.doFilter(request,response);
            }

        }else{
            filterChain.doFilter(request,response);
        }

    }

    public static boolean isAjaxRequest(HttpServletRequest request){
        String header = request.getHeader("X-Requested-With");
        if(header != null && "XMLHttpRequest".equals(header))
            return true;
        else
            return false;

    }
}
