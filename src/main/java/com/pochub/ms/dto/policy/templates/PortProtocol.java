package com.pochub.ms.dto.policy.templates;

import lombok.Data;

@Data
public class PortProtocol {
	public String port;
	public String protocol;
	public boolean portsAllowed;
}