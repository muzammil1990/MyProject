package com.volvo.java.Java8_Features;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.lang.*;

class Test {

	private static Test obj;
	
	private Test() {
		
	}
	
	public static synchronized Test getInstance() {
		if(obj==null)
			obj= new Test();
		return obj;
	}
	
}
