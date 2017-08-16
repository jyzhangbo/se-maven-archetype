package cn.ennwifi.datahub.api.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhangbo
 *
 */
@Controller
@RequestMapping("/")
public class MainController {

  @RequestMapping(value = {"/", "/index"}, method = {RequestMethod.GET})
  public void index(HttpServletRequest request, HttpServletResponse response) {
    try {
      response.sendRedirect("doc/index");
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
