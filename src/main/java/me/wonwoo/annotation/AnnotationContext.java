package me.wonwoo.annotation;

import me.wonwoo.annotation.config.AppConfig;
import me.wonwoo.bean.SomeBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class AnnotationContext {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(AppConfig.class);
    SomeBean bean = context.getBean(SomeBean.class);
    bean.hello("wonwoo");
  }
}
