package com.example.demo.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class SecuritySession {

    public String getUsername() {
        // ログイン時に作成したUserDetailsオブジェクトは、
        // SecurityContextHolderに格納される。
        // SecurityContextHolderに格納されたUserDetailsオブジェクトから
        // ユーザーIDを取得するロジックは以下の通り。
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();

        if (authentication != null) {
            Object principal = authentication.getPrincipal();
            if (principal instanceof UserDetails) {
                return ((UserDetails) principal).getUsername();
            }
            return (String) principal.toString();
        }
        return null;
    }
}
