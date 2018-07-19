package com.nano.start.oauth2.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@RequestMapping(value="/api/test1", method=RequestMethod.GET)
	public String get0() {
		return "aaa";
	}
	
	@RequestMapping(value="/api/test2", method=RequestMethod.GET)
	public String get1() {
		return "public";
	}
}
