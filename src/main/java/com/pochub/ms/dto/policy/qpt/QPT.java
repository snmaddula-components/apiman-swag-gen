package com.pochub.ms.dto.policy.qpt;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class QPT {
	public QuarantineNetworkGroupDetails quarantine_network_group_details;
	public String status;
	public String lowerName;
	@JsonProperty("Outbound")
	public List<Object> outbound;
	public String description;
	@JsonProperty("Inbound")
	public List<Inbound> inbound;
	public String name;
	public String username;
	public QuarantineResGroupDetails quarantine_res_group_details;
	public QuarantineDomainGroupDetails quarantine_domain_group_details;
	public boolean has_permission;
	public String modifiedDate;
	public String createdDate;
	@JsonProperty("Domains")
	public List<Domain> domains;
	public String _id;
	public int assetCount;
}
