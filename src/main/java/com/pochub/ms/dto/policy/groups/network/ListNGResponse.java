package com.pochub.ms.dto.policy.groups.network;

import java.util.List;

import com.pochub.ms.dto.Pagination;
import com.pochub.ms.dto.Status;

import lombok.Data;

@Data
public class ListNGResponse {
    public Status status;
    public Pagination pagination;
    public List<ListNGItem> data;
}
