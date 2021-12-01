package com.example.oauthtest.oauth.info;

import com.example.oauthtest.oauth.ProviderType;
import com.example.oauthtest.oauth.info.GoogleOAuth2UserInfo;
import com.example.oauthtest.oauth.info.OAuth2UserInfo;

import java.util.Map;

public class OAuth2UserInfoFactory {
    public static OAuth2UserInfo getOAuth2UserInfo(ProviderType providerType, Map<String, Object> attributes) {
        switch (providerType) {
            case GOOGLE: return new GoogleOAuth2UserInfo(attributes);
            default: throw new IllegalArgumentException("Invalid Provider Type.");
        }
    }
}
