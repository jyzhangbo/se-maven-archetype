package cn.ennwifi.datahub.api.content.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

import cn.ennwifi.datahub.api.codes.ErrorCodes;
import cn.ennwifi.datahub.api.content.view.ErrorView;
import cn.ennwifi.datahub.api.service.LoggerService;

/**
 * 全局控制器 行为定制.
 *
 * @author zhangjianshe
 */

@ControllerAdvice
public class GlobalHandlerAdvicer {

  /** The log service. */
  @Autowired
  LoggerService logService;

  /**
   * Request handling no handler found.
   *
   * @param req the req
   * @param ex the ex
   * @return the model and view
   */
  @ExceptionHandler(NoHandlerFoundException.class)
  @ResponseStatus(value = HttpStatus.NOT_FOUND)
  @ResponseBody
  public ModelAndView requestHandlingNoHandlerFound(HttpServletRequest req, NoHandlerFoundException ex) {
    String url = req.getRequestURL().toString();
    logService.error(url, ErrorCodes.ERROR_RESOURCE_NOT_FIND.message);
    return new ErrorView(ErrorCodes.ERROR_RESOURCE_NOT_FIND.code, ErrorCodes.ERROR_RESOURCE_NOT_FIND.message);
  }

  /**
   * 请求方法找不到.
   * 
   * @param req
   * @param ex
   * @return
   */
  @ExceptionHandler(NoClassDefFoundError.class)
  public ModelAndView requestNoClassDefFoundError(HttpServletRequest req, NoClassDefFoundError ex) {
    String url = req.getRequestURL().toString();
    logService.error(url, ErrorCodes.ERROR_RESOURCE_NOT_FIND.message);
    return new ErrorView(ErrorCodes.ERROR_RESOURCE_NOT_FIND.code, ErrorCodes.ERROR_RESOURCE_NOT_FIND.message);
  }

  /**
   * 调用方法不支持时 返回的视图.
   *
   * @param request the request
   * @param exception the exception
   * @return the model and view
   */
  @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
  public ModelAndView handlerMethodNotSupportException(HttpServletRequest request, Exception exception) {
    String url = request.getRequestURL().toString();
    logService.error(url, ErrorCodes.ERROR_REQUEST_METHOD_NOT_SUPPORT.message);
    return new ErrorView(ErrorCodes.ERROR_REQUEST_METHOD_NOT_SUPPORT);
  }

  /**
   * Http message not readable exception handler.
   *
   * @param request the request
   * @param exception the exception
   * @return the model and view
   */
  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ModelAndView httpMessageNotReadableExceptionHandler(HttpServletRequest request,
      HttpMessageNotReadableException exception) {
    String url = request.getRequestURL().toString();
    logService.error(url, ErrorCodes.ERROR_REQUEST_BODY.bind(exception.getMessage()).message);

    return new ErrorView(ErrorCodes.ERROR_REQUEST_BODY.bind(exception.getMessage()));
  }



  /**
   * Code exception error handler.
   *
   * @param request the request
   * @param exception the exception
   * @return the model and view
   */
  @ExceptionHandler(value = {CodeException.class})
  public ModelAndView codeExceptionErrorHandler(HttpServletRequest request, CodeException exception) {
    String url = request.getRequestURL().toString();
    logService.error(url, exception.getMessage());
    return new ErrorView(exception.getCode(), exception.getMessage());
  }

  /**
   * 处理参数绑定验证错误.
   *
   * @param request the request
   * @param exception the exception
   * @return the model and view
   */

  @ExceptionHandler(value = {MethodArgumentNotValidException.class})
  public ModelAndView handleBindError(HttpServletRequest request, MethodArgumentNotValidException exception) {
    BindingResult br = exception.getBindingResult();

    StringBuilder sb = new StringBuilder();
    for (ObjectError ex : br.getAllErrors()) {
      sb.append(ex.getDefaultMessage());
      sb.append(";");
    }
    String url = request.getRequestURL().toString();
    logService.error(url, ErrorCodes.ERROR_PARAMETER.bind(sb.toString()).message);
    return new ErrorView(ErrorCodes.ERROR_PARAMETER.bind(sb.toString()));
  }



  /**
   * Default error handler.
   *
   * @param request the request
   * @param exception the exception
   * @return the model and view
   */
  @ExceptionHandler(value = {Exception.class})
  public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception exception) {

    String url = request.getRequestURL().toString();
    String msg = exception.toString();
    if (msg.contains("NullPointerException")) {
      msg = "空指针错误";
    }
    StackTraceElement[] stackTrace = exception.getStackTrace();
    if (stackTrace.length > 0) {
      StackTraceElement ste = stackTrace[0];
      msg += "\r\n错误代码在" + ste.getClassName() + "类:" + ste.getMethodName() + "方法的" + ste.getLineNumber() + "行";
    }
    logService.error(url, msg);
    return new ErrorView(5, msg);
  }

}
