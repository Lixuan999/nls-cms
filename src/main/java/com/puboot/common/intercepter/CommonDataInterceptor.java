package com.puboot.common.intercepter;

import com.puboot.component.CommonDataService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Nobita
 */
@Component
@AllArgsConstructor
public class CommonDataInterceptor implements HandlerInterceptor {

    private final CommonDataService commonDataService;


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView mv) throws Exception {
        if (mv != null) {
            mv.addAllObjects(commonDataService.getAllCommonData());
        }
    }
}