package com.pochub.ms.dto.alert;

import java.util.List;

import lombok.Data;

@Data
public class AlertRuleResponse {
	private List<AlertRule> data;
	private AlertRuleStatus status;
}