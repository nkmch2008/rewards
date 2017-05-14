package com.vodafone.rewards.domain;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Reward {
	private List<String> credit=new ArrayList<String>();;
	private List<String> voucher=new ArrayList<String>();
	private String firstName;
	private String lastName;

}
