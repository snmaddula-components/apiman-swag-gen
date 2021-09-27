package com.pochub.ms.dto.tags;

import java.util.List;

import lombok.Data;

@Data
public class ListTagsResponse {
	public List<ListTagItem> items;
	public String statusMessage;
	public String version;
	public int statusCode;
}