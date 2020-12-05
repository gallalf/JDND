package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PricingServiceApplicationTests {

	private static final String RESOURCE_URL = "http://localhost:8762/prices";

	@Test
	public void contextLoads() {
	}

	@Test
	public void testPricingById(){
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		ResponseEntity<Price> response = testRestTemplate.
				getForEntity(RESOURCE_URL + "/1", Price.class);

		assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}
}
