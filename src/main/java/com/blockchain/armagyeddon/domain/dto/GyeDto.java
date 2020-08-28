package com.blockchain.armagyeddon.domain.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GyeDto {

    private String type;

    private String title;

    private int targetMoney;

    private int period;

    private int totalMember;

    private String state;

    private String master;

}
