package com.test.logback;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test9 {

	final static Logger logger = LoggerFactory.getLogger(Test9.class);

	@Test
	public void testLog() {

		SLF4jConfigUtil.configure("./src/main/resources/logback-test9.xml");

		logger.info("DEBUG - test pass config file {}");
		
		logger.info("INFO - test pass config file {}");
		
		logger.info("KEEP - this won't be filtered out");

	}
}
