package space.bulat.tgcloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorizeController {

  @GetMapping("/auth")
  public String getLoginPage() {
    return "loginPage";
  }

}
