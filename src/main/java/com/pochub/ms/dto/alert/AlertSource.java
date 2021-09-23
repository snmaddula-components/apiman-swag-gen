package com.pochub.ms.dto.alert;

import lombok.Data;

@Data
public class AlertSource {
	private String asset_state;
	private String groups;
	private String resource_state;
	private String shost;
	private String src;
}
