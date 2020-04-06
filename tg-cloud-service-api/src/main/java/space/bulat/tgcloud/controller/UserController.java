package space.bulat.tgcloud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import space.bulat.tgcloud.dto.AuthenticationRequest;
import space.bulat.tgcloud.dto.AuthenticationResponse;

/**
 * 06.04.2020
 *
 * @author Bulat Muzipov
 */
@RestController
@RequestMapping(UserController.BASE_PATH)
public class UserController {

    public static final String BASE_PATH = "/api/v1";
    private static final String AUTH_PATH = "/auth";

    @GetMapping(AUTH_PATH)
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody final AuthenticationRequest request) {
        System.out.println(request.toString());

        return ResponseEntity.ok(new AuthenticationResponse());
    }
}
