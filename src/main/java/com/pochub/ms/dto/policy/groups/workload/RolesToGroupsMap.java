package com.pochub.ms.dto.policy.groups.workload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pochub.ms.dto.policy.groups.ALL;

import lombok.Data;

@Data
public class RolesToGroupsMap {
    @JsonProperty("ALL") 
    public ALL aLL;
}
