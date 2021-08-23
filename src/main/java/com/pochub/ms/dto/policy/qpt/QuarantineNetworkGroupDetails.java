package com.pochub.ms.dto.policy.qpt;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class QuarantineNetworkGroupDetails {
	@JsonProperty("Inbound")
	public Inbound inbound;
	@JsonProperty("Outbound")
	public Outbound outbound;
}