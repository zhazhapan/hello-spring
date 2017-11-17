/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.conditional;

/**
 * @author pantao
 *
 */
public class LinuxListServiceImpl implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}
}
