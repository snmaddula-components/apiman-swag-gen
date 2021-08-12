package com.pochub.ms.dto.policy.accessparams;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class AccessParamsListResponse {

	public Status status;
	public Pagination pagination;
	public List<AccessParams> data;
}