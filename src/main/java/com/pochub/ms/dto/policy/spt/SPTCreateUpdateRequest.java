package com.pochub.ms.dto.policy.spt;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.pochub.ms.dto.policy.qpt.Domain;
import com.pochub.ms.dto.policy.qpt.Inbound;
import com.pochub.ms.dto.policy.qpt.Outbound;

import lombok.Data;

@Data
public class SPTCreateUpdateRequest {
	public String name;
	public String description;
	@JsonProperty("Inbound")
	public List<Inbound> inbound;
	@JsonProperty("Outbound")
	public List<Outbound> outbound;
	@JsonProperty("Domains")
	public List<Domain> domains;
}