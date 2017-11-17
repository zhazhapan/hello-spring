/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author pantao
 *
 */
public class Jsr250WayService {
        @PostConstruct
        public void init() {
                System.out.println("jsr250-init-method");
        }

        public Jsr250WayService() {
                super();
                System.out.println("初始化构造函数-JSR250WayService");
        }

        @PreDestroy
        public void destroy() {
                System.out.println("jsr250-destory-method");
        }
}
