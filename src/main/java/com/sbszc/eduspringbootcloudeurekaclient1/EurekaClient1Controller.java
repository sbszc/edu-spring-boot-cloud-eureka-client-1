package com.sbszc.eduspringbootcloudeurekaclient1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClient1Controller {

	@GetMapping("ping")
	public String ping() {
		return "ping";
	}
}
