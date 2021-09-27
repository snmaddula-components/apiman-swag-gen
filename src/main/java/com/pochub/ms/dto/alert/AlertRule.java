package com.pochub.ms.dto.alert;

import java.util.List;

import lombok.Data;

@Data
public class AlertRule {
    private String _id;
    private String category;
    private List<List<String>> conditions;
    private String description;
    private boolean enabled;
    private int order;
    private List<Integer> policy_action;
    private int priority;
    private String python_format;
    private int schema_version;
    private String type;
    private String unique_mapper;
}
