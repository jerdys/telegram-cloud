package space.bulat.tgcloud.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.StringJoiner;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Hex;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

  final static String botHash = "947625546:AAFooWmR0Au0f1wepL0BKPgHDbQ6YtjcSGE";

  public Boolean verifyAuth(String id, String first_name, String username,
      String last_name, String auth_date, String hash) {
    try {

      final StringJoiner joiner = new StringJoiner("\\n");

      Mac sha256_HMAC = Mac.getInstance("HmacSHA256");

      joiner.add("auth_date=" + auth_date)
          .add("first_name=" + first_name)
          .add("hash=" + hash)
          .add("id=" + id)
          .add("last_name=" + last_name)
          .add("username=" + username);

      final String dataCheckString = joiner.toString();

      sha256_HMAC.init(new SecretKeySpec(MessageDigest.getInstance("SHA-256")
          .digest(botHash.getBytes(StandardCharsets.UTF_8)),
          "SHA256"));
      return Hex.encodeHexString(sha256_HMAC.doFinal(dataCheckString.getBytes())).equals(hash);
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }

  }

}
