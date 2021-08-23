package com.pochub.ms.dto.policy.groups.domain;

import java.util.List;

import com.pochub.ms.dto.policy.groups.Filter;

import lombok.Data;

@Data
public class ListDGItem {
    public String status;
    public String name;
    public List<String> roles;
    public String tenantId;
    public String state;
    public String role;
    public List<Filter> filters;
    public String createdDate;
    public boolean has_permission;
    public String _id;
    public String group_type;
    public String description;
    public String username;
}
