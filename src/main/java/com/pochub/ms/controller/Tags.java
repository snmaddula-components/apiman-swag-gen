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

import com.pochub.ms.dto.audit.AuditEventResponse;
import com.pochub.ms.dto.tags.CreateTagsRequest;
import com.pochub.ms.dto.tags.CreateTagsResponse;
import com.pochub.ms.dto.tags.ListTagsResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Tags", value = "Tags", description = " ")
@RequestMapping("/{tenant}/tags")
public class Tags {

	@GetMapping
	@ApiOperation("List All Tags with Filters")
	public ListTagsResponse listAllTags(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long from,
			@RequestParam(required = false) Long to, @RequestParam(required = false) Long limit) {
		return new ListTagsResponse();
	}

	@PostMapping
	@ApiOperation("Bulk Create Tags & Values")
	public CreateTagsResponse bulkCreateTags(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestBody CreateTagsRequest payload) {
		return new CreateTagsResponse();
	}

	@PutMapping
	@ApiOperation("Bulk Update Tags & Values")
	public AuditEventResponse bulkUpdateTags(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long from,
			@RequestParam(required = false) Long to, @RequestParam(required = false) Long limit) {
		return new AuditEventResponse();
	}

	@DeleteMapping
	@ApiOperation("Bulk Delete Tags")
	public AuditEventResponse bulkDeleteTags(@PathVariable String tenant,
			@RequestHeader("x-api-token") String apiClientToken, @RequestParam(required = false) Long from,
			@RequestParam(required = false) Long to, @RequestParam(required = false) Long limit) {
		return new AuditEventResponse();
	}

}
