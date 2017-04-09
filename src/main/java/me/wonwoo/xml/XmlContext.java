package me.wonwoo.xml;

import me.wonwoo.bean.SomeBean;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class XmlContext {

  public static void main(String[] args) {
    GenericXmlApplicationContext context =
        new GenericXmlApplicationContext("classpath:/spring/spring-context.xml");
    SomeBean bean = context.getBean(SomeBean.class);
    bean.hello("wonwoo");
  }
}
