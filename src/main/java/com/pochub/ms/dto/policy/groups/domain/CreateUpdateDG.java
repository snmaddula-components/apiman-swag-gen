package com.pochub.ms.dto.policy.groups.domain;

import java.util.List;

import com.pochub.ms.dto.policy.groups.Filter;

import lombok.Data;

@Data
public class CreateUpdateDG {
	public String name;
	public String description;
	public String state;
	public String group_type;
	public List<Filter> filters;
}
