package cloud.paolu.xpanel.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.casbin.casdoor.entity.CasdoorUser;
import org.springframework.web.servlet.HandlerInterceptor;

public class UserLoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        CasdoorUser user = (CasdoorUser) session.getAttribute("casdoorUser");
        if (user != null) {
            return true;
        }
        response.sendRedirect(request.getContextPath() + "login");
        return false;
    }
}