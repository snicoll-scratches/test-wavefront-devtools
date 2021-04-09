package com.example.testwavefrontdevtools;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Stephane Nicoll
 */
@RestController
class HomeController {

	@RequestMapping("/")
	String home() {
		return "Hello World";
	}
	
}
