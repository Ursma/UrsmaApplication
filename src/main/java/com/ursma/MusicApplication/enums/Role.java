package com.ursma.MusicApplication.enums;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@RequiredArgsConstructor
public enum Role implements GrantedAuthority {
    USER("USER"),
    ADMIN("ADMIN");
    private final String authority;
    @Override
    public String getAuthority(){
        return "ROLE_" + authority;
    }

}
