package com.pochub.ms.dto.policy.groups.network;

import java.util.List;

import com.pochub.ms.dto.policy.groups.Filter;

import lombok.Data;

@Data
public class CreateUpdateNG {
    public String name;
    public String description;
    public String state;
    public String group_type;
    public List<Filter> filters;
    public boolean allowRemoteAccess;
    public boolean enable_dnat;
    public String network_type;
}
