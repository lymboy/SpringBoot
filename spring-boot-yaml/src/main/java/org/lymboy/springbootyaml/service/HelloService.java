package org.lymboy.springbootyaml.service;

import org.lymboy.springbootyaml.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sairo
 * @since 2018/10/4 20:10
 */
@Configuration
public class HelloService {
    @Bean
    public Person person() {
        return new Person();
    }
}
