package com.pochub.ms.dto.policy.accesspolicies;

import java.util.List;

import com.pochub.ms.dto.policy.templates.PortProtocol;

public class CreateUpdateAccessPolicy {
	public List<To> to;
	public List<Object> access_params;
	public List<From> from;
	public List<PortProtocol> port_protocol;
}