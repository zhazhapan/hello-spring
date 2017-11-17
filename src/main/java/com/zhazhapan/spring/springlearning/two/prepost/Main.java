/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pantao
 *
 */
public class Main {

        /**
         * @param args
         */
        public static void main(String[] args) {
                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                                PrePostConfig.class);
                context.getBean(BeanWayService.class);
                context.getBean(Jsr250WayService.class);
                context.close();
        }
}
