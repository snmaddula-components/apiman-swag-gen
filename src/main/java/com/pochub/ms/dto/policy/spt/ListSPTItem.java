package com.pochub.ms.dto.policy.spt;

import java.util.List;

import lombok.Data;

@Data
public class ListSPTItem {
    public String username;
    public String _id;
    public String description;
    public List<Rule> rules;
    public String tenantId;
    public String modifiedDate;
    public boolean has_permission;
    public String lowerName;
    public String id;
    public String createdAt;
    public String name;
}
