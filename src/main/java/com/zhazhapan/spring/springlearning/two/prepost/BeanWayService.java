/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.prepost;

/**
 * @author pantao
 *
 */
public class BeanWayService {
        public void init() {
                System.out.println("@Bean-init-method");
        }

        public BeanWayService() {
                super();
                System.out.println("初始化构造函数-BeanWayService");
        }

        public void destroy() {
                System.out.println("@Bean-destroy-method");
        }
}
