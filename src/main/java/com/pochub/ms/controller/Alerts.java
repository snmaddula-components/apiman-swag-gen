package com.pochub.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pochub.ms.dto.alert.AlertsResponse;
import com.pochub.ms.dto.audit.AuditCategoryResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Alerts", value = "Alerts", description = " ")
@RequestMapping("/{tenant}/alerts")
public class Alerts {
	
	enum AlertStatus {
		pending,
		investigated
	}

	@GetMapping
	@ApiOperation("List Alerts")
	public AlertsResponse listAlerts(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, 
			@RequestParam(defaultValue = "all") String duration, 
			@RequestParam(defaultValue = "createddate") String sortcolumn,
			@RequestParam(defaultValue = "desc") String sortdirection,
			@RequestParam(required = false) String rules,
			@RequestParam(required = false) String status,
			@RequestParam(defaultValue = "2") Long limit)  {
		return new AlertsResponse();
	}
	
	@GetMapping("/rules")
	@ApiOperation("List Alert Rules")
	public AuditCategoryResponse listAuditTypes(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken) {
		return new AuditCategoryResponse();
	}
	
}
