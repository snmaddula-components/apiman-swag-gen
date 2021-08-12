package com.pochub.ms.dto.policy.groups;

import lombok.Data;

@Data
public class UserGroup {
	public boolean exclude;
	public String _id;
	public String name;
	public String source;
}
