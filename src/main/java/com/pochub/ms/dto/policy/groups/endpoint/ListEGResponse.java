package com.pochub.ms.dto.policy.groups.endpoint;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class ListEGResponse {
    public Status status;
    public Pagination pagination;
    public List<ListEGItem> data;
}
