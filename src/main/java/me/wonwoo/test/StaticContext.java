package me.wonwoo.test;

import me.wonwoo.bean.SomeBean;
import org.springframework.context.support.StaticApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class StaticContext {

  public static void main(String[] args) {
    StaticApplicationContext context = new StaticApplicationContext();
    context.registerSingleton("some", SomeBean.class);
    context.refresh();
    SomeBean bean = context.getBean(SomeBean.class);
    bean.hello("wonwoo");

  }
}
