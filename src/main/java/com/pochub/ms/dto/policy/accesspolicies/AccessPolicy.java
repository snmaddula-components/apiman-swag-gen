package com.pochub.ms.dto.policy.accesspolicies;

import java.util.List;

import com.pochub.ms.dto.policy.accessparams.AccessParam;
import com.pochub.ms.dto.policy.templates.PortProtocol;

public class AccessPolicy {
	public String status;
	public From from;
	public String name;
	public To to;
	public String modifiedDate;
	public String createdDate;
	public boolean has_permission;
	public List<AccessParam> access_params;
	public String _id;
	public List<PortProtocol> port_protocol;
}