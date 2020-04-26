 package com.internal.working;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;

public class HashMapEx {
	
	static Logger logger=Logger.getLogger(HashMapEx.class);

	public static void main(String[] args) {

		
		
		  logger.info("Start Timme "+new Date());
		
		Map<String, String> map = new ConcurrentHashMap<>();
		
		for (long i = 0; i < 1000000l; i++) {
			map.put("Key"+i,"value"+i );
		}
		
		logger.info("End  Timme "+new Date());

	}

}
