/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {
        public static void main(String[] args) {
                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
                context.getEnvironment().setActiveProfiles("prod");
                context.register(ProfileConfig.class);
                context.refresh();// 刷新容器
                DemoBean demoBean = context.getBean(DemoBean.class);
                System.out.println(demoBean.getContent());
                context.close();
        }
}
