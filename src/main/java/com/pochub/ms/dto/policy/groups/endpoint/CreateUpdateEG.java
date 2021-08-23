package com.pochub.ms.dto.policy.groups.endpoint;

import java.util.List;

import com.pochub.ms.dto.policy.groups.Filter;
import com.pochub.ms.dto.policy.groups.StateDir;

import lombok.Data;

@Data
public class CreateUpdateEG {
	public String name;
	public String description;
	public List<Filter> filters;
	public String group_type;
	public String state;
	public boolean corporatePolicyTemplates;
	public List<String> corporatePolicies;
	public List<String> securityPolicyTemplates;
	public StateDir state_dir;
	public boolean allowRemoteAccess;
	public boolean enable_dnat;
}
