package com.pochub.ms.dto.policy.spt;

import com.pochub.ms.dto.policy.accesspolicies.From;
import com.pochub.ms.dto.policy.accesspolicies.To;

import lombok.Data;

@Data
public class Rule{
    public To to;
    public ConnectionInfo connectionInfo;
    public From from;
}