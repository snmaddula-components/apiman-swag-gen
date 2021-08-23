package com.pochub.ms.dto.policy.accessparams;

import java.util.List;

import lombok.Data;

@Data
public class CreateUpdateAccessParams {

	public String name;
	public String description;
	public List<CreateUpdatePortPolicy> portPolicy;
}