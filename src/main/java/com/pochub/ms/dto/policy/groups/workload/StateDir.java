package com.pochub.ms.dto.policy.groups.workload;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class StateDir{
    @JsonProperty("Inbound") 
    public boolean inbound;
    @JsonProperty("Outbound") 
    public boolean outbound;
}