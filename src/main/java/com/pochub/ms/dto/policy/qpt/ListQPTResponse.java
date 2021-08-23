package com.pochub.ms.dto.policy.qpt;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class ListQPTResponse {
	public Status status;
	public Pagination pagination;
	public List<QPT> data;
	public int statusCode;
}