package com.example.demo.controller;

import com.example.demo.dto.TodoItemDto;
import com.example.demo.service.TodoItemService;
import lombok.extern.slf4j.Slf4j;
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
    	// TODO
    	 return ResponseEntity.ok(request.getRemoteAddr());
    }
}
