package com.pochub.ms.dto.alert;

import java.util.Date;

import lombok.Data;

@Data
public class Alert {
	private String _id;
	private String category;
	private Date createddate;
	private String desc;
	private String event;
	private int hash;
	private boolean mail_sent;
	private String ruleId;
	private String severity;
	private boolean skipped_counter_event;
	private AlertSource source;
	private String status;
	private String type;
	private Date updateddate;
}
