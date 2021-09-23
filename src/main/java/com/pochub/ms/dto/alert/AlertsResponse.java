package com.pochub.ms.dto.alert;

import java.util.List;

import lombok.Data;

@Data
public class AlertsResponse {
	private List<Alert> data;
	private AlertPagination pagination;
	private AlertStatus status;
}