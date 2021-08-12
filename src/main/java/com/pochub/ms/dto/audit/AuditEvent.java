package com.pochub.ms.dto.audit;

import java.util.Date;

import lombok.Data;

@Data
public class AuditEvent {
	public String _id;
	public String message;
	public Meta meta;
	public Date timestamp;
	public String actionLabel;
}