package org.recap.request;

import lombok.Data;

import java.util.List;

@Data
public class ItemStatusCheckRequest {
    private List<ItemStatus> itemStatus;
}
