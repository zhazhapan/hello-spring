/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.el;

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
                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
                ElConfig resourceService = context.getBean(ElConfig.class);
                resourceService.outputResource();
                context.close();
        }
}
