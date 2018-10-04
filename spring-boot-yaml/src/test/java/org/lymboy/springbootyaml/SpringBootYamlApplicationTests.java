package org.lymboy.springbootyaml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.lymboy.springbootyaml.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootYamlApplicationTests {

    @Autowired
    private Person person;

    @Autowired
    ApplicationContext ac;

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    /**
     * 测试 @Bean 注解
     */
    @Test
    public void testHelloService() {
        boolean containsBean = ac.containsBean("person");

        System.out.println(containsBean);
    }

}
