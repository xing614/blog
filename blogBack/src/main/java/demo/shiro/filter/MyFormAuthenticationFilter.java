package demo.shiro.filter;

import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

public class MyFormAuthenticationFilter extends FormAuthenticationFilter {
    @Override  
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {  
    	System.out.println("------------MyFormAuthenticationFilter---------------");
        if(this.isLoginRequest(request, response)) {  
            if(this.isLoginSubmission(request, response)) {  
                return this.executeLogin(request, response);  
            } else {  
                return true;  
            }  
        } else {  
            String header = ((HttpServletRequest) request).getHeader("Content-Type");  
            if(header != null && header.equals("application/x-www-form-urlencoded")){  
                response.setCharacterEncoding("UTF-8");  
                PrintWriter out = response.getWriter();  
                out.print("{\"isOver\" : true }");  
                out.flush();  
                out.close();  
            }else{  
                this.saveRequestAndRedirectToLogin(request, response);  
            }  
            return false;  
        }  
    }  
  
} 
