package com.vodafone.rewards.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Voucher {
	private String voucherNumber;
	private Double voucherValue;
	private String currency;
	private String firstName;
	private String lastName;

}
