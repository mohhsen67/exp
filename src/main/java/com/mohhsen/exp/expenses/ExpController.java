package com.mohhsen.exp.expenses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExpController {
    @GetMapping("/")
	public String addCategory() {
		return "Added new category";
	}
}
