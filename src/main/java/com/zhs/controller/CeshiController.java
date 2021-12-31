package com.zhs.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

;


/**
 * Created by 维C果糖 on 2017/1/24.
 */
public class CeshiController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request,
                                                 javax.servlet.http.HttpServletResponse response) throws Exception {

        System.out.println(request.getRequestURI());  // 获取Controller的名称，即地址

        return new ModelAndView("index");  // 逻辑名
    }
}