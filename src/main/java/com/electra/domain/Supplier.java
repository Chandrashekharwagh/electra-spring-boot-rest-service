package com.electra.domain;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Supplier {
    private long id;
    private String name;
    private String contactInfo;
}
