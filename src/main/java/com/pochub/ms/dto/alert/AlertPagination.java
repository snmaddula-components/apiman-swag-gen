package com.pochub.ms.dto.alert;

import lombok.Data;

@Data
public class AlertPagination {
	private String limit;
	private AlertSort sort;
	private int startIndex;
	private int total;
}