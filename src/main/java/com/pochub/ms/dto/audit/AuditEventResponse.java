package com.pochub.ms.dto.audit;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class AuditEventResponse {
	public List<AuditEvent> data;
	public Status status;
	public Pagination pagination;
	public int statusCode;
}