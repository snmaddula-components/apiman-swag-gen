package com.pochub.ms.dto.audit;

import lombok.Data;

@Data
public class Meta {
	public String action;
	public String tenant;
}