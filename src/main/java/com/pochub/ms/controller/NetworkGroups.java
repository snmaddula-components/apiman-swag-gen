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
import com.pochub.ms.dto.policy.groups.network.CreateUpdateNG;
import com.pochub.ms.dto.policy.groups.network.ListNGResponse;
import com.pochub.ms.dto.policy.templates.GenericPolicyResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Network Groups", value = "Network Groups", description = " ")
@RequestMapping("/{tenant}/policy/network-groups")
public class NetworkGroups {

	@GetMapping
	@ApiOperation("List all Network Groups")
	public ListNGResponse list(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(defaultValue = "2") Long limit) {
		return new ListNGResponse();
	}

	@PostMapping
	@ApiOperation("Create Network Group")
	public GenericPolicyResponse create(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken,
			@RequestBody CreateUpdateNG payload) {
		return new GenericPolicyResponse();
	}

	@PutMapping("{id}")
	@ApiOperation("Update Network Group")
	public GenericPolicyResponse update(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken,
			@PathVariable String id, @RequestBody CreateUpdateNG payload) {
		return new GenericPolicyResponse();
	}

	@DeleteMapping
	@ApiOperation("Delete Network Groups by Ids")
	public GenericPolicyResponse delete(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken,
			@RequestBody DeleteByIdsRequest payload) {
		return new GenericPolicyResponse();
	}

}
