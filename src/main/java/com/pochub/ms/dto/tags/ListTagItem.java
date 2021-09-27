package com.pochub.ms.dto.tags;

import lombok.Data;

@Data
public class ListTagItem {
	public String id;
	public String key;
	public String lowerKey;
	public ValueSet valueSet;
	public String tenantId;
	public String _id;
	public int schemaVersion;
}