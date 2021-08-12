package com.pochub.ms.dto.policy.groups;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class NetworkGroupListResponse {

	public Status status;
	public Pagination pagination;
	public List<NetworkGroup> data;
}