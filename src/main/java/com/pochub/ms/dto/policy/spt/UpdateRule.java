package com.pochub.ms.dto.policy.spt;

import com.pochub.ms.dto.policy.accesspolicies.From;
import com.pochub.ms.dto.policy.accesspolicies.To;

import lombok.Data;

@Data
public class UpdateRule{
    public To to;
    public String connectionInfoId;
    public From from;
}