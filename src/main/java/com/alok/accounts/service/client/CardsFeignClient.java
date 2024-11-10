package com.alok.accounts.service.client;

import com.alok.accounts.dto.CardsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

@Primary
@FeignClient(name = "cards", fallback = CardsFallBack.class)
public interface CardsFeignClient {
    @GetMapping(value = "/api/fetch", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("correlation-id") String correlationId, @RequestParam String mobileNumber);
    }


