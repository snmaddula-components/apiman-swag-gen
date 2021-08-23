package com.pochub.ms.dto.policy.spt;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class ListSPTResponse {
	public Status status;
	public Pagination pagination;
	public List<SPT> data;
	public int statusCode;
}