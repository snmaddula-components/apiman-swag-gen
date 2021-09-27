package com.pochub.ms.dto.tags;

import java.util.List;

import lombok.Data;

@Data
public class CreateTagsResponse {
	public List<String> items;
	public String statusMessage;
	public String version;
	public int statusCode;
}