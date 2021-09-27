package com.pochub.ms.dto.tags;

import java.util.List;

import lombok.Data;

@Data
public class CreateTagsRequest {
	private List<CreateTag> tags;
}
