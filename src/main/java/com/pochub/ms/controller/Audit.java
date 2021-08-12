package com.pochub.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pochub.ms.dto.audit.AuditCategoryResponse;
import com.pochub.ms.dto.audit.AuditEventResponse;

@RestController
@RequestMapping("/public/api/v1/{tenant}/audit")
public class Audit {
	
	@GetMapping("/events")
	public AuditEventResponse listAuditEvents(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, 
			@RequestParam(required = false) Long from, @RequestParam(required = false) Long to, @RequestParam(required = false) Long limit)  {
		return new AuditEventResponse();
	}
	
	@GetMapping("/types")
	public AuditCategoryResponse listAuditTypes(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken) {
		return new AuditCategoryResponse();
	}
	
}
