/**
 * 
 */
package com.zhazhapan.spring.springlearning.two.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author pantao
 *
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
