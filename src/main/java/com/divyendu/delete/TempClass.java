package com.divyendu.delete;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TempClass {

	@RequestMapping("/employee")
	public Employee func() {
		return new Employee("Ram");
	}
}
