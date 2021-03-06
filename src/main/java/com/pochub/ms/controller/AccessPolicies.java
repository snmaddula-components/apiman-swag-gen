package com.pochub.ms.controller;

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

import com.pochub.ms.dto.DeleteByIdsRequest;
import com.pochub.ms.dto.policy.accesspolicies.AccessPoliciesListResponse;
import com.pochub.ms.dto.policy.accesspolicies.CreateUpdateAccessPolicy;
import com.pochub.ms.dto.policy.templates.GenericPolicyResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/{tenant}/policy/access-policies")
@Api(tags = "Access Policies", value = "Access Policies", description = " ")
public class AccessPolicies {

	@GetMapping
	@ApiOperation("List all Access Policies")
	public AccessPoliciesListResponse list(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(defaultValue = "2") Long limit) {
		return new AccessPoliciesListResponse();
	}

	@PostMapping
	@ApiOperation("Create Access Policy")
	public GenericPolicyResponse create(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestBody CreateUpdateAccessPolicy payload) {
		return new GenericPolicyResponse();
	}

	@PutMapping("{id}")
	@ApiOperation("Update Access Policy")
	public GenericPolicyResponse update(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @PathVariable String id,
			@RequestBody CreateUpdateAccessPolicy payload) {
		return new GenericPolicyResponse();
	}

	@DeleteMapping
	@ApiOperation("Delete Access Policies by Ids")
	public GenericPolicyResponse delete(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestBody DeleteByIdsRequest payload) {
		return new GenericPolicyResponse();
	}

}
