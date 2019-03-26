package com.iotechsys.test.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {

	@GetMapping(value = "/dummy", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> GetDummy() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("Hello", "Get");
		System.out.println(result.toString());
		return result;
	}

	@DeleteMapping(value = "/dummy", produces = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> DeleteDummy() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("Hello", "Delete");
		System.out.println(result.toString());
		return result;
	}

	@PostMapping(value = "/dummy", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> PostDummy(@RequestBody String body) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("Hello", "Post");
		result.put("body", body);
		System.out.println(result.toString());
		return result;
	}

	@PutMapping(value = "/dummy", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Map<String, String> PutDummy(@RequestBody String body) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("Hello", "Put");
		result.put("body", body);
		System.out.println(result.toString());
		return result;
	}

}
