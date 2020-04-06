package space.bulat.tgcloud.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

/**
 * 06.04.2020
 *
 * @author Bulat Muzipov
 */
@Getter
@Setter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class AuthenticationRequest {

    private String id;
    private String firstName;
    private String lastName;
    private String username;
    private String photoUrl;
    private String authDate;
    private String hash;
}
