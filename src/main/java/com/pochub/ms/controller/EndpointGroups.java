package com.pochub.ms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pochub.ms.dto.policy.groups.EndpointGroupListResponse;

@RestController
@RequestMapping("/public/api/v1/{tenant}/policy/endpoint-groups")
public class EndpointGroups {
	
	@GetMapping
	public EndpointGroupListResponse list(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long limit) {
		return new EndpointGroupListResponse();
	}
	
	@PostMapping
	public void create(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @RequestBody Object payload) {
		
	}
	
	@PutMapping("{id}")
	public void update(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @PathVariable String id) {
		
	}
	
	@DeleteMapping
	public void delete(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @RequestBody List<String> ids) {
		
	}
	
}
