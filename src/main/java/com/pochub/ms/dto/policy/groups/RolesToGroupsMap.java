package com.pochub.ms.dto.policy.groups;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RolesToGroupsMap{
    @JsonProperty("ALL") 
    public ALL aLL;
}
