package com.novles.test.web;

import com.novles.test.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/members/search")
    public ResponseEntity<?> getMembers(){
        return new ResponseEntity<>(memberService.getMembers(),HttpStatus.OK);
    }
}
