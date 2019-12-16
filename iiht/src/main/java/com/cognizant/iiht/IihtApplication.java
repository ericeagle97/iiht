package com.cognizant.iiht;

import java.text.ParseException;

import org.springframework.context.ApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class IihtApplication {

		private static final Logger LOGGER = LoggerFactory.getLogger(IihtApplication.class);

		// Entry point of the application
		public static void main(String[] args) throws ParseException {
			ApplicationContext applicationContext = SpringApplication.run(IihtApplication.class, args);
		}

	}


