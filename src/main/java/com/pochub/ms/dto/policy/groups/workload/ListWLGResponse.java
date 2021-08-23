package com.pochub.ms.dto.policy.groups.workload;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class ListWLGResponse {
    public Status status;
    public Pagination pagination;
    public List<ListWLGItem> data;
}
