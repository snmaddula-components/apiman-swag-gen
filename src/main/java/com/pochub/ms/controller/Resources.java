package com.pochub.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pochub.ms.dto.policy.templates.GenericPolicyResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/public/api/v1/{tenant}")
@Api(tags = "Resources", value = "Resources", description = " ")
public class Resources {

//	@GetMapping("/resources")
//	public AuditEventResponse listAuditEvents(@PathVariable String tenant,
//			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long from,
//			@RequestParam(required = false) Long to, @RequestParam(required = false) Long limit) {
//		return new AuditEventResponse();
//	}
//
//	@PostMapping("/resources/{resourceId}/quarantine")
//	public AuditEventResponse quarantine(@PathVariable String tenant, @PathVariable String resourceId,
//			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long from,
//			@RequestParam(required = false) Long to, @RequestParam(required = false) Long limit) {
//		return new AuditEventResponse();
//	}
//
//	@PostMapping("/resources/{resourceId}/unquarantine")
//	public AuditEventResponse unquarantine(@PathVariable String tenant, @PathVariable String resourceId,
//			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long from,
//			@RequestParam(required = false) Long to, @RequestParam(required = false) Long limit) {
//		return new AuditEventResponse();
//	}

	@ApiOperation("List Policy Tampering Info of a Resource")
	@PostMapping("/policy/tampered-details")
	public GenericPolicyResponse policyTampering(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam String resource_id,
			@RequestParam(required = false) Long limit) {
		return new GenericPolicyResponse();
	}

	@ApiOperation("List Network Exposure Info of a Resource")
	@GetMapping("/probe/exposure-info/{resourceId}")
	public GenericPolicyResponse exposureInfo(@PathVariable String tenant, @PathVariable String resourceId,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long limit) {
		return new GenericPolicyResponse();
	}

	@ApiOperation("List Security Vulnerability Info of a Resource")
	@PostMapping("/probe/security-info/{resourceId}")
	public GenericPolicyResponse vulnerabilityInfo(@PathVariable String tenant, @PathVariable String resourceId,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long limit) {
		return new GenericPolicyResponse();
	}

}
