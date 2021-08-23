package com.pochub.ms.dto.policy.groups.workload;

import lombok.Data;

@Data
public class Filter{
    public String attribute_name;
    public String attribute_value;
    public boolean exclude;
    public boolean hasDuplicate;
    public boolean invalid;
    public boolean selected;
}