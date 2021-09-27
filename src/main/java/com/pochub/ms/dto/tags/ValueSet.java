package com.pochub.ms.dto.tags;

import java.util.List;

import lombok.Data;

@Data
public class ValueSet{
    public List<String> entries;
    public boolean allowCustom;
    public String type;
}
