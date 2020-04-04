package space.bulat.tgcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.bulat.tgcloud.service.AuthenticationService;

/**
 * 04.04.2020
 *
 * @author Bulat Muzipov
 */
@RestController
@RequestMapping("/test")
public class TestController {

  @Autowired
  private AuthenticationService authenticationService;

  @GetMapping
  public ResponseEntity<String> test(@RequestParam(required = false) final String name) {
    if (StringUtils.isEmpty(name)) {
      return ResponseEntity.ok("Hello!");
    } else {
      return ResponseEntity.ok(String.format("Hello, %s", name));
    }
  }

  @GetMapping("/auth")
  public ResponseEntity<String> getAuthentication(@RequestParam String id,
      @RequestParam String first_name, @RequestParam String username,
      @RequestParam String last_name, @RequestParam(required = false) String photo_url,
      @RequestParam String auth_date, @RequestParam String hash) {

    return ResponseEntity
        .ok(authenticationService.verifyAuth(id, first_name, username, last_name, auth_date, hash)
            .toString());
  }
}
