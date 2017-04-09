package me.wonwoo.groovy;

import me.wonwoo.bean.SomeBean;
import org.springframework.context.support.GenericGroovyApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class GroovyContext {
  public static void main(String[] args) {

    GenericGroovyApplicationContext genericGroovyApplicationContext =
        new GenericGroovyApplicationContext("classpath:/spring/spring-context.groovy");
    SomeBean bean = genericGroovyApplicationContext.getBean(SomeBean.class);
    bean.hello("wonwoo");
  }
}
