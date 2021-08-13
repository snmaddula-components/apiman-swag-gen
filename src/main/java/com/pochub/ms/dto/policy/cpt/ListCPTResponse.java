package com.pochub.ms.dto.policy.cpt;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class ListCPTResponse {
	public Status status;
	public Pagination pagination;
	public List<CPT> data;
	public int statusCode;
}
