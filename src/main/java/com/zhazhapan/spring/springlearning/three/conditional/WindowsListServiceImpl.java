/**
 * 
 */
package com.zhazhapan.spring.springlearning.three.conditional;

/**
 * @author pantao
 *
 */
public class WindowsListServiceImpl implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}
}
