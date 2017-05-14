package com.vodafone.rewards.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.vodafone.rewards.domain.Credit;
import com.vodafone.rewards.domain.Voucher;
@Service
public class ExternalRestServiceCaller {
	
	@Autowired
	RestTemplate restTemplate;
	
	
	public List<Credit> getCredits() {
		// call the web service using the resttemplate for getting credit data here returning mock data
		
		Credit credit1=Credit.builder().firstName("Drew").lastName("Barrymore").creditId("C072341").points(100).build();
		Credit credit2=Credit.builder().firstName("Johnny").lastName("Depp").creditId("C3475634").points(50).build();
		Credit credit3=Credit.builder().firstName("Drew").lastName("Barrymore").creditId("C34857").points(10).build();
		
		return Arrays.asList(credit1,credit2,credit3);
	}

	public List<Voucher> getVouchers() {
		// call the web service using the resttemplate for getting voucher data here returning mock data
		
		Voucher voucher1=Voucher.builder().firstName("Drew").lastName("Barrymore").currency("INR").voucherNumber("V2378578346").voucherValue(1200d).build();
		Voucher voucher2=Voucher.builder().firstName("Johnny").lastName("Depp").currency("USD").voucherNumber("V183240062").voucherValue(5d).build();
		Voucher voucher3=Voucher.builder().firstName("Drew").lastName("Barrymore").currency("INR").voucherNumber("V45708293").voucherValue(500d).build();
		Voucher voucher4=Voucher.builder().firstName("Brad").lastName("Pitt").currency("INR").voucherNumber("V1106").voucherValue(60d).build();
		
		
		
		return Arrays.asList(voucher1,voucher2,voucher3,voucher4);
	}

}
