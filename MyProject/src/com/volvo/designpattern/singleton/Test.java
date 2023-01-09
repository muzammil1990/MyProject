package com.volvo.designpattern.singleton;

public class Test {

	private static Test obj;

	private Test() {

	}

	public static synchronized Test getInstance() {
		if (obj == null)
			obj = new Test();

		return obj;
	}
}


