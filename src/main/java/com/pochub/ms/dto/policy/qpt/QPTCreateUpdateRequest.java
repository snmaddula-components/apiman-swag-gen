package com.pochub.ms.dto.policy.qpt;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class QPTCreateUpdateRequest {
	public String name;
	public String description;
	@JsonProperty("Inbound")
	public List<Inbound> inbound;
	@JsonProperty("Outbound")
	public List<Outbound> outbound;
	@JsonProperty("Domains")
	public List<Domain> domains;
}