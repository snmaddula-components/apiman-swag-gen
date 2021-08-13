package com.pochub.ms.dto.policy.templates;

import java.util.List;

import lombok.Data;

@Data
public class Rule{
    public List<String> accessParamIds;
    public List<String> ipaddresses;
    public List<PortProtocol> port_protocol;
}