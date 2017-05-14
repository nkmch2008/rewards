package com.vodafone.rewards.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Credit {
	private String creditId;
	private int points;
	private String firstName;
	private String lastName;

}
