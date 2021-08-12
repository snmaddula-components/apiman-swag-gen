package com.pochub.ms.dto.policy.groups;

import java.util.List;

import lombok.Data;

@Data
public class EndpointGroup {
	public int assigned_policy_count;
	public String status;
	public String description;
	public List<String> roles;
	public UserDepartments user_departments;
	public List<Object> resources;
	public String state;
	public String name;
	public String username;
	public List<Object> securityPolicyTemplates;
	public List<Object> auto_quarantine_template_id_list;
	public List<Object> remote_resources;
	public String group_type;
	public List<Filter> filters;
	public String createdDate;
	public boolean has_permission;
	public String tenantId;
	public String _id;
	public List<UserGroup> user_groups;
	public List<Object> corporatePolicies;
	public String modifiedDate;
}