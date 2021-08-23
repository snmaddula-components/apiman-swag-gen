package com.pochub.ms.dto.policy.accessparams;

import lombok.Data;

@Data
public class CreateUpdatePortPolicy {
	public String endPortRange;
	public String startPortRange;
	public String protocol;
}