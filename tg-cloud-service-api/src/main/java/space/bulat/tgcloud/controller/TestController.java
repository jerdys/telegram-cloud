package space.bulat.tgcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 04.04.2020
 *
 * @author Bulat Muzipov
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<String> test(@RequestParam(required = false) final String name) {
        if (StringUtils.isEmpty(name)) {
            return ResponseEntity.ok("Hello!");
        } else {
            return ResponseEntity.ok(String.format("Hello, %s", name));
        }
    }
}
