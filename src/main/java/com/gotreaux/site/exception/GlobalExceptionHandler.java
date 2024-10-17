package com.gotreaux.site.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ModelAndView handleException(Exception e) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("error");
        mv.getModel().put("errorMessage", e.getMessage());

        return mv;
    }
}
