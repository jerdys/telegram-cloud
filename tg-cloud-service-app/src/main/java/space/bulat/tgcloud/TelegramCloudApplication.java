package space.bulat.tgcloud;

import java.util.concurrent.TimeUnit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 04.04.2020
 *
 * @author Bulat Muzipov
 */
@SpringBootApplication
public class TelegramCloudApplication implements WebMvcConfigurer {

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
      registry.addResourceHandler("/static/**")
          .addResourceLocations("classpath:/static/")
          .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS).cachePublic());
  }

  public static void main(final String[] args) {
    SpringApplication.run(TelegramCloudApplication.class, args);
  }
}
