package com.pochub.ms.dto;

import lombok.Data;

@Data
public class Pagination {
	public int total;
	public Sort sort;
	public int limit;
	public int startIndex;
}
