package com.example.oauthtest.api;

import com.example.oauthtest.oauth.info.OAuth2UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/oauth/redirect")
    public ResponseEntity t(@RequestParam(value = "token") String token) {
        return ResponseEntity.ok(token);
    }

    @GetMapping("/test")
    public ResponseEntity t2() {
        return ResponseEntity.ok("success");
    }
}
