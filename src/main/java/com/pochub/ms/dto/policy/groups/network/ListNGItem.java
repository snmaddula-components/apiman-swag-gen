package com.pochub.ms.dto.policy.groups.network;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pochub.ms.dto.policy.groups.Filter;

import lombok.Data;

@Data
public class ListNGItem {
	public String status;
	public boolean is_cpt;
	public String description;
	public List<String> roles;
	public String tenantId;
	@JsonProperty("entity-state")
	public String entityState;
	public String state;
	public boolean internal;
	public String role;
	public List<Filter> filters;
	public String createdDate;
	public boolean has_permission;
	public String _id;
	public String network_type;
	public String group_type;
	public String name;
	public int assigned_policy_count;
	public boolean allowRemoteAccess;
	public String username;
	public boolean enable_dnat;
}
