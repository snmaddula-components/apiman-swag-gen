package com.pochub.ms.dto.tags;

import java.util.List;

import lombok.Data;

@Data
public class CreateTag {
	private String key;
	private String description;
	private List<String> values;
}