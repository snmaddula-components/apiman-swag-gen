package com.pochub.ms.dto.policy.groups;

import java.util.List;

import lombok.Data;

@Data
public class UserDepartments {
	public boolean exclude;
	public List<Object> departments;
}