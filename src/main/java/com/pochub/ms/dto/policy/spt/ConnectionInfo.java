package com.pochub.ms.dto.policy.spt;

import java.util.List;

import lombok.Data;

@Data
public class ConnectionInfo{
    public String status;
    public String description;
    public String tenantId;
    public boolean readonly;
    public List<PortPolicy> portPolicy;
    public String createdDate;
    public String _id;
    public String id;
    public String name;
}