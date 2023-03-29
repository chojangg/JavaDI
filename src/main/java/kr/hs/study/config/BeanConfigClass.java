package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {

    @Bean
    public TestBean1 java1(){
        TestBean1 t=new TestBean1(2,2.2,"spring2");
        return t;
    }
}
