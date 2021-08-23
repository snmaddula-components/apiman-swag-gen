package com.pochub.ms.dto.policy.groups.workload;

import java.util.List;

import com.pochub.ms.dto.policy.groups.Filter;
import com.pochub.ms.dto.policy.groups.StateDir;

import lombok.Data;

@Data
public class CreateUpdateWLG {
    public String name;
    public String description;
    public List<Filter> filters;
    public List<Object> securityPolicyTemplates;
    public String group_type;
    public String state;
    public StateDir state_dir;
    public boolean allowRemoteAccess;
    public boolean enable_dnat;
    public boolean corporatePolicyTemplates;
    public List<Object> corporatePolicies;
}
