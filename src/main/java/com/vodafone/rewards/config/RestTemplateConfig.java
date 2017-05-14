package com.vodafone.rewards.config;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate(getConverters());
	}

	public List<HttpMessageConverter<?>> getConverters() {
		List<HttpMessageConverter<?>> converters = new ArrayList<HttpMessageConverter<?>>();
		converters.add(new MappingJackson2HttpMessageConverter());
		return converters;
	}

}
