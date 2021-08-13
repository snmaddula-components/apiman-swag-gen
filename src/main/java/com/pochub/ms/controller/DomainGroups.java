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
import com.pochub.ms.dto.policy.groups.DomainGroupListResponse;
import com.pochub.ms.dto.policy.templates.GenericPolicyResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/public/api/v1/{tenant}/policy/domain-groups")
@Api(tags = "Domain Groups", value = "Domain Groups", description = " ")
public class DomainGroups {

	@GetMapping
	@ApiOperation("List all Domain Groups")
	public DomainGroupListResponse list(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(defaultValue = "2") Long limit) {
		return new DomainGroupListResponse();
	}

	@PostMapping
	@ApiOperation("Create Domain Group")
	public void create(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken,
			@RequestBody Object payload) {

	}

	@PutMapping("{id}")
	@ApiOperation("Update Domain Group")
	public void update(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken,
			@PathVariable String id) {

	}

	@DeleteMapping
	@ApiOperation("Delete Domain Groups by Ids")
	public GenericPolicyResponse delete(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestBody DeleteByIdsRequest payload) {
		return new GenericPolicyResponse();
	}

}
