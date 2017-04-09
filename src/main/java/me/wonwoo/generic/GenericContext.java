package me.wonwoo.generic;

import me.wonwoo.bean.SomeBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.GenericApplicationContext;

/**
 * Created by wonwoolee on 2017. 4. 9..
 */
public class GenericContext {

  public static void main(String[] args) {
    DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
    beanFactory.registerSingleton("someBean", new SomeBean());
    GenericApplicationContext context = new GenericApplicationContext(beanFactory);
    context.refresh();
    SomeBean bean = context.getBean(SomeBean.class);
    bean.hello("wonwoo");
  }
}
