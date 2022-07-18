package com.example.springsecurity.restapi;

import com.example.springsecurity.dto.AccountLoginDto;
import com.example.springsecurity.dto.AccountRegisterDto;
import com.example.springsecurity.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/accounts")
@RequiredArgsConstructor
public class AccountController {
    final AccountService accountService;

    @RequestMapping(path = "register")
    public ResponseEntity<?> register(@RequestBody AccountRegisterDto accountRegisterDto) {
        return ResponseEntity.ok().body(accountService.register(accountRegisterDto));
    }
    @RequestMapping(path = "login",method = RequestMethod.POST)
    public ResponseEntity<?> login(@RequestBody AccountLoginDto accountLoginDto) {
        return ResponseEntity.ok().body(accountService.Login(accountLoginDto))  ;
    }
    @RequestMapping(method = RequestMethod.POST)
    public String getInformation(){
        return "";
    }
}
