package com.pochub.ms.dto.policy.groups;

import lombok.Data;

@Data
public class Filter {
    public String attribute_value;
    public boolean hasDuplicate;
    public String attribute_name;
    public boolean invalid;
    public boolean exclude;
    public boolean selected;
}