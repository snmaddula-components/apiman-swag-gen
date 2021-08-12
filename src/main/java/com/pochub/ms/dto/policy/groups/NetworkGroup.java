package com.pochub.ms.dto.policy.groups;

import java.util.List;

import lombok.Data;

@Data
public class NetworkGroup {
	public String status;
	public String username;
	public String description;
	public List<String> roles;
	public boolean allowRemoteAccess;
	public String tenantId;
	public String state;
	public String role;
	public List<Filter> filters;
	public String createdDate;
	public boolean has_permission;
	public boolean enable_dnat;
	public String _id;
	public String network_type;
	public String group_type;
	public String name;
}