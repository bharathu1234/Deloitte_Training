package com.deloitte.assignment2;

import java.util.Comparator;

public class EmplyeeSort implements Comparator<EmplyeeVo> {

	public EmplyeeSort() {

	}

	@Override
	public int compare(EmplyeeVo e1, EmplyeeVo e2) {

		return (int) (e1.getIncometa() - e2.getIncometa());
	}

	
}