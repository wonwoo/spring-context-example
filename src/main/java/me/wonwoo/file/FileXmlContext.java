package me.wonwoo.file;

import me.wonwoo.bean.SomeBean;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class FileXmlContext {

  public static void main(String[] args) {
    FileSystemXmlApplicationContext context =
        new FileSystemXmlApplicationContext(
            "src/main/resources/spring/spring-context.xml");
    SomeBean bean = context.getBean(SomeBean.class);
    bean.hello("wonwoo");
  }
}
