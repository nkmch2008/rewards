package com.vodafone.rewards.controller;

import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.rewards.domain.Reward;
import com.vodafone.rewards.service.RewardsService;

@RestController
public class RewardsController {
	@Autowired
	RewardsService  rewardsService;

	 @RequestMapping(value = "/rewards", method = RequestMethod.GET)
	    public ResponseEntity<?> getRewards() {
		 
		 List<Reward> rewards=rewardsService.getRewards();
	      /*  List<MarkdownLadder> markdownLadders = markdownLadderService.getMarkdownLadderByPriceStrategyId(priceStrategyId);
	        MarkdownLadderModel markdownLadderModel = new MarkdownLadderModel(markdownLadders, null);*/
	        return new ResponseEntity<>(rewards, OK);
	    }
	

}
