package com.cognizant.AuditBenchMark.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name="audit-authorization-service", url="${AUTH.URL}")
public interface AuthClient {
	
	@GetMapping("/validate")
	public ResponseEntity<Boolean> validate(@RequestHeader(name = "Authorization") String token1);

}
