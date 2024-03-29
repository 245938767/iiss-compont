package cn.iiss.security.base;

import cn.iiss.security.util.HandleHttpErrorUtil;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;


@Component
public class CustomAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException e) throws IOException, ServletException {
        try{
            HandleHttpErrorUtil.handleHttpError(request,response,e);
        }catch (Exception throwable){
            response.sendError(HttpStatus.UNAUTHORIZED.value(), "Unauthorized");
        }
    }
}