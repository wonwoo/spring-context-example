package me.wonwoo.classpath;

import me.wonwoo.bean.SomeBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class ClassPathXmlContext {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("spring-context.xml", ClassPathXmlContext.class);
    SomeBean bean = context.getBean(SomeBean.class);
    bean.hello("wonwoo");

  }
}
