package com.pochub.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pochub.ms.dto.alert.AlertRuleResponse;
import com.pochub.ms.dto.alert.AlertsResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(tags = "Alerts", value = "Alerts", description = " ")
@RequestMapping("/{tenant}/alerts")
public class Alerts {

	enum AlertStatus {
		pending, investigated
	}

	@GetMapping
	@ApiOperation("List Alerts")
	public AlertsResponse listAlerts(@ApiParam(required = true, value = "Tenant Name") @PathVariable String tenant,
			@ApiParam(required = true, value = "API Client Token") @RequestHeader("x-api-token") String apiClientToken,
			@ApiParam("Duration") @RequestParam(defaultValue = "all") String duration,
			@ApiParam("Sort by Field") @RequestParam(defaultValue = "createddate") String sortcolumn,
			@ApiParam("Sort Direction") @RequestParam(defaultValue = "desc") String sortdirection,
			@ApiParam("Rules (commaseparated)") @RequestParam(required = false) String rules,
			@ApiParam("Alert Status") @RequestParam(required = false) AlertStatus status,
			@ApiParam("Limit Response") @RequestParam(defaultValue = "2") Long limit) {
		return new AlertsResponse();
	}

	@GetMapping("/rules")
	@ApiOperation("List Alert Rules")
	public AlertRuleResponse listAlertRules(
			@ApiParam(required = true, value = "Tenant Name") @PathVariable String tenant,
			@ApiParam(required = true, value = "API Client Token") @RequestHeader("x-api-token") String apiClientToken) {
		return new AlertRuleResponse();
	}

}
