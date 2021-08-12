package com.pochub.ms.dto.policy.accessparams;

import java.util.List;

import lombok.Data;

@Data
public class AccessParams {
	public String description;
	public boolean readonly;
	public List<PortPolicy> portPolicy;
	public String createdDate;
	public boolean has_permission;
	public String _id;
	public String id;
	public String name;
}