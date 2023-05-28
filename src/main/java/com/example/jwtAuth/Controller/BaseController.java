package com.example.jwtAuth.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
}
