package com.pochub.ms.dto.policy.cpt;

import com.pochub.ms.dto.policy.templates.Rule;

import lombok.Data;

@Data
public class CPT {
    public String status;
    public String username;
    public String _id;
    public String name;
    public Rule rule;
    public String modifiedDate;
    public String createdDate;
    public boolean has_permission;
    public String networkGroupId;
    public String lowerName;
    public String description;
}
