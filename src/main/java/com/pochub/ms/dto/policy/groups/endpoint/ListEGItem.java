package com.pochub.ms.dto.policy.groups.endpoint;

import java.util.List;

import com.pochub.ms.dto.policy.groups.Filter;
import com.pochub.ms.dto.policy.groups.MapCptRuleIds;
import com.pochub.ms.dto.policy.groups.RolesToGroupsMap;
import com.pochub.ms.dto.policy.groups.StateDir;

import lombok.Data;

@Data
public class ListEGItem {
    public String username;
    public List<Filter> filters;
    public boolean allowRemoteAccess;
    public boolean spt_based_roles;
    public MapCptRuleIds map_cpt_rule_ids;
    public StateDir state_dir;
    public List<Object> securityPolicyTemplates;
    public RolesToGroupsMap roles_to_groups_map;
    public String state;
    public List<Object> remote_resources;
    public boolean corporatePolicyTemplates;
    public List<Object> resources;
    public String status;
    public String description;
    public String modifiedDate;
    public String createdDate;
    public String name;
    public List<String> roles;
    public String tenantId;
    public String group_type;
    public boolean has_permission;
    public boolean enable_dnat;
    public String _id;
    public List<Object> corporatePolicies;

}
