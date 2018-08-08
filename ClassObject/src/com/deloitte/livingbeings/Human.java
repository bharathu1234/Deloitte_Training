package com.deloitte.livingbeings;

import com.deloitte.livingbeings.organs.Eye;

public class Human extends Mammals {
	
	public HumanEye leftEye; //fields
	HumanEye rightEye;
	
	Human(){
		leftEye = new HumanEye();
		rightEye = new HumanEye();
	}
	
	
	public class HumanEye extends Eye{
		
		
	}

}
