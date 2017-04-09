package me.wonwoo.annotation.config;

import me.wonwoo.bean.SomeBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class AppConfig {

  @Bean
  SomeBean someBean () {
    return new SomeBean();
  }

}
