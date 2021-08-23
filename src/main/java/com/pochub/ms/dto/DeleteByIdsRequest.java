package com.pochub.ms.dto;

import java.util.List;

import lombok.Data;

@Data
public class DeleteByIdsRequest {
	public List<String> ids;
}