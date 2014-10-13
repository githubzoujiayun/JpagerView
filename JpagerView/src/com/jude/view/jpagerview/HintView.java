package com.jude.view.jpagerview;

/**
 * 
 * @author Jude
 * 
 * 提示view的接口。
 * 
 *
 */
public interface HintView {
	
	//初始化max与显示位置
	public void initView(int length,int gravity);
	
	//设置当前项
	public void setCurrent(int current);
}
