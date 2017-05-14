package com.vodafone.rewards.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.rewards.domain.Credit;
import com.vodafone.rewards.domain.Reward;
import com.vodafone.rewards.domain.Voucher;
@Service
public class RewardsService {
	
	@Autowired
	ExternalRestServiceCaller externalRestServiceCaller;
	
	public List<Reward> getRewards(){
		
		List<Voucher> vouchers=externalRestServiceCaller.getVouchers();
		List<Credit> credits=externalRestServiceCaller.getCredits();
		List<Reward> rewards=getRewardsByPerson(vouchers,credits);
		return rewards;
	}

	private List<Reward> getRewardsByPerson(List<Voucher> vouchers, List<Credit> credits) {
		//hashmap is  faster for searching records
		HashMap<String,Reward> rewards=new HashMap<String,Reward>();
		String key=null;
		Reward existingReward=null;
		for (Voucher voucher : vouchers) {
			key=voucher.getFirstName()+"-"+voucher.getLastName();
			if(rewards.get(key)!=null){
				Reward reward=new Reward();
				reward.setFirstName(voucher.getFirstName());
				reward.setLastName(voucher.getLastName());
				reward.getVoucher().add(voucher.getVoucherNumber());
				rewards.put(key, reward);
			}else{
				existingReward=rewards.get(key);
				existingReward.getVoucher().add(voucher.getVoucherNumber());
			}
		}
		for (Credit credit : credits) {
			key=credit.getFirstName()+"-"+credit.getLastName();
			if(rewards.get(key)!=null){
			Reward reward=new Reward();
			reward.setFirstName(credit.getFirstName());
			reward.setLastName(credit.getLastName());
			reward.getCredit().add(credit.getCreditId());
			rewards.put(key, reward);
			}else{
				existingReward=rewards.get(key);
				existingReward.getCredit().add(credit.getCreditId());
			}	
		}
		return new ArrayList<Reward>(rewards.values());

	}

	
}
