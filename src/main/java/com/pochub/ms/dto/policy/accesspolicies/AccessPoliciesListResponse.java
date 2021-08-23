package com.pochub.ms.dto.policy.accesspolicies;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;
import com.pochub.ms.dto.policy.accessparams.AccessParam;

import lombok.Data;

@Data
public class AccessPoliciesListResponse {

	public Status status;
	public Pagination pagination;
	public List<AccessParam> data;
}