package com.example.demo.controller;

import com.example.demo.dto.TodoItemDto;
import com.example.demo.service.TodoItemService;
import lombok.extern.slf4j.Slf4j;

import java.util.Iterator;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import jakarta.servlet.http.HttpServletRequest;

@Slf4j
@RequestMapping("/api/clientip")
@RestController
public class ClientIpCheckRestController {


    /**
     * clientIp 조회
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<?> getClientIp(HttpServletRequest request) {
    	// check client ip
    	for (Iterator iterator = request.getHeaderNames().asIterator(); iterator.hasNext();) {
			String type = (String) iterator.next();
			System.out.println(type);
		}
        String ip = request.getHeader("x-forwarded-for");
        log.info("X-Forwarded-For: {}", ip);
        if (ip == null || ip.isEmpty()) {
            ip = request.getRemoteAddr();
        }
    	 return ResponseEntity.ok("remoteAddr :" + request.getRemoteAddr() + ", x-forwarded-for: " + request.getHeader("x-forwarded-for"));
    }
}
