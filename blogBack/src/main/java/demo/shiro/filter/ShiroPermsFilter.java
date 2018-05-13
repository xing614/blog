package demo.shiro.filter;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.StringUtils;
import org.apache.shiro.web.filter.authz.PermissionsAuthorizationFilter;
import org.apache.shiro.web.util.WebUtils;

import demo.util.JsonUtils;
import demo.util.RespCode;
import demo.util.ReturnJsonBody;

/**
 * 权限不足的过滤
 * @author liang
 *
 */
public class ShiroPermsFilter extends PermissionsAuthorizationFilter {
	/**
	 * shiro认证perms资源失败后回调方法
	 */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {

    	System.out.println("-------------------权限过滤------------------");
    	HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;  
        HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;  
  
        Subject subject = getSubject(servletRequest, servletResponse);  
  
        if (subject.getPrincipal() == null) {  
            if (demo.util.WebUtils.isAjax(httpRequest)) {  
            	try {
					demo.util.WebUtils.sendJson(httpResponse, JsonUtils.objectToJsonStr(new ReturnJsonBody(RespCode.UserOver)));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            } else {  
                saveRequestAndRedirectToLogin(servletRequest, servletResponse);  
            }  
            System.out.println("用户为空");
        } else {  
            if (demo.util.WebUtils.isAjax(httpRequest)) {  
            	try {
					demo.util.WebUtils.sendJson(httpResponse, JsonUtils.objectToJsonStr(new ReturnJsonBody(RespCode.UserAuthority)));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
            } else {  
                String unauthorizedUrl = getUnauthorizedUrl();  
                if (StringUtils.hasText(unauthorizedUrl)) {  
                    WebUtils.issueRedirect(servletRequest, servletResponse, unauthorizedUrl);  
                } else {  
                    WebUtils.toHttp(servletResponse).sendError(401);  
                }  
            }
            System.out.println("用户不为空");
        }  
        return false; 
    }
}
