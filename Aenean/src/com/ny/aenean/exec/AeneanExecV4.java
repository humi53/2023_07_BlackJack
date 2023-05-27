package com.ny.aenean.exec;

import com.ny.aenean.service.AeneanService;
import com.ny.aenean.service.impl.AeneanServiceImplV4;

public class AeneanExecV4 {
	public static void main(String[] args) {
		AeneanService anService = new AeneanServiceImplV4();
		anService.start();
	}
}
