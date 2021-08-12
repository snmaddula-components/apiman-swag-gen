package com.pochub.ms.dto.policy.accessparams;

import lombok.Data;

@Data
public class PortPolicy {
	public String target;
	public String startPortRange;
	public String protocol;
	public String endPortRange;
	public String proto;
}