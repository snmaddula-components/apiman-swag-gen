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

import com.pochub.ms.dto.DeleteByIdsRequest;
import com.pochub.ms.dto.policy.spt.ListSPTResponse;
import com.pochub.ms.dto.policy.spt.UpdateSPT;
import com.pochub.ms.dto.policy.templates.GenericPolicyResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/{tenant}/policy/security-templates")
@Api(tags = "Security Policy Templates", value = "Security Policy Templates", description = " ")
public class SecurityPolicyTemplates {

	@GetMapping
	@ApiOperation("List all Security Policy Templates")
	public ListSPTResponse list(@PathVariable String tenant, @RequestHeader("x-api-token") String apiClientToken,
			@RequestParam(defaultValue = "2") Long limit) {
		return new ListSPTResponse();
	}

	@PostMapping
	@ApiOperation("Create Security Policy Template")
	public GenericPolicyResponse create(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestBody List<UpdateSPT> payload) {
		return new GenericPolicyResponse();
	}

	@PutMapping("{id}")
	@ApiOperation("Update Security Policy Template")
	public GenericPolicyResponse update(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @PathVariable String id, @RequestBody UpdateSPT payload) {
		return new GenericPolicyResponse();
	}

	@DeleteMapping
	@ApiOperation("Delete Security Policy Templates by Ids")
	public GenericPolicyResponse delete(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestBody DeleteByIdsRequest payload) {
		return new GenericPolicyResponse();
	}

}