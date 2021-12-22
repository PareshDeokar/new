package com.cg.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.service.SecurityServiceImpl;

@RestController
@RequestMapping("/securityservice")
public class SecurityServiceController {
@Autowired
SecurityServiceImpl security;
}
