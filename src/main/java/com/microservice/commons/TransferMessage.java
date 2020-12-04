package com.microservice.commons;

import com.microservice.commons.Transfer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferMessage {
    private Transfer transfer;
}
