package com.pochub.ms.dto.policy.templates;

import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class GenericPolicyResponse {
	public Object data;
	public Status status;
	public int statusCode;
}