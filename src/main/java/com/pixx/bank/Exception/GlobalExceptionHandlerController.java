package com.pixx.bank.Exception;//package com.pixx.Reg.com.pixx.kahta.exception;
//
//import java.io.IOException;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletResponse;
//
//
//import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
//import org.springframework.boot.web.servlet.error.ErrorAttributes;
//import org.springframework.context.annotation.Bean;
//import org.springframework.http.HttpStatus;
//import org.springframework.com.pixx.kahta.security.access.AccessDeniedException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//import org.springframework.web.context.request.RequestAttributes;
//
//@RestControllerAdvice
//public class GlobalExceptionHandlerController {
//
//  @Bean
//  public ErrorAttributes errorAttributes() {
//    // Hide com.pixx.kahta.exception field in the return object
//    return new DefaultErrorAttributes() {
//      @Override
//      public Map<String, Object> getErrorAttributes(RequestAttributes requestAttributes, boolean includeStackTrace) {
//        Map<String, Object> errorAttributes = super.getErrorAttributes(requestAttributes, includeStackTrace);
//        errorAttributes.remove("com.pixx.kahta.exception");
//        return errorAttributes;
//      }
//    };
//  }
//
//  @ExceptionHandler(CustomException.class)
//  public void handleCustomException(HttpServletResponse res, CustomException ex) throws IOException {
//    res.sendError(ex.getHttpStatus().value(), ex.getMessage());
//  }
//
//  @ExceptionHandler(AccessDeniedException.class)
//  public void handleAccessDeniedException(HttpServletResponse res) throws IOException {
//    res.sendError(HttpStatus.FORBIDDEN.value(), "Access denied");
//  }
//
//  @ExceptionHandler(Exception.class)
//  public void handleException(HttpServletResponse res) throws IOException {
//    res.sendError(HttpStatus.BAD_REQUEST.value(), "Something went wrong");
//  }
//
//}
