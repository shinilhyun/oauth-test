package com.example.oauthtest.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Configuration
public class AppProperties {

    @Value("${app.token-secret}")
    private String tokenSecret;
    @Value("${app.token-expiry}")
    private long tokenExpiry;
    @Value("${app.refresh-token-expiry}")
    private long refreshTokenExpiry;

    @Value("${app.authorizedRedirectUris}")
    private List<String> authorizedRedirectUris;

}

