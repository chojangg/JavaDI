package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        ctx.close();
        System.out.println("-----------------------------------");

        AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBean1 obj2 = ctx2.getBean("java1", TestBean1.class);
        obj2.prData();
        ctx2.close();
        System.out.println("-----------------------------------");

    }
}