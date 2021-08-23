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
import com.pochub.ms.dto.policy.qpt.ListQPTResponse;
import com.pochub.ms.dto.policy.qpt.QPTCreateUpdateRequest;
import com.pochub.ms.dto.policy.templates.GenericPolicyResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/{tenant}/policy/quarantine-templates")
@Api(tags = "Quarantine Policy Templates", value = "Quarantine Policy Templates", description = " ")
public class QuarantinePolicyTemplates {
	
	@GetMapping
	@ApiOperation("List all Quarantine Policy Templates")
	public ListQPTResponse list(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @RequestParam(defaultValue = "2") Long limit) {
		return new ListQPTResponse();
	}
	
	@PostMapping
	@ApiOperation("Create Quarantine Policy Template")
	public GenericPolicyResponse create(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @RequestBody QPTCreateUpdateRequest payload) {
		return new GenericPolicyResponse();
	}
	
	@PutMapping("{id}")
	@ApiOperation("Update Quarantine Policy Template")
	public GenericPolicyResponse update(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @PathVariable String id, @RequestBody QPTCreateUpdateRequest payload) {
		return new GenericPolicyResponse();
	}
	
	@DeleteMapping
	@ApiOperation("Delete Quarantine Policy Templates by Ids")
	public GenericPolicyResponse delete(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken, @RequestBody DeleteByIdsRequest payload) {
		return new GenericPolicyResponse();
	}
	
}