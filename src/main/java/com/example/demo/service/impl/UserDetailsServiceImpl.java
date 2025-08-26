package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
// UserDetailsServiceを実装。このクラスがAutowiredで取り込まれる。
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private MessageSource messageSource;
	
    @Override
    public UserDetails loadUserByUsername(String username) throws 
UsernameNotFoundException {

    	// プロパティファイルから呼び出し元の画面タイトルを取得しコンソール出力
    	System.out.println("呼び出し元：" +
    		messageSource.getMessage("login.title", null, Locale.JAPAN));
    	
        String password;

        // ユーザー情報取得（実際にはDBや外部ファイル等で管理する）
        if (username.equals("user")) {
            // パスワードはハッシュ化した状態で管理する
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            password = encoder.encode("password");
            System.out.println("ハッシュ化後のパスワード: " + password);
        } else {
            // ユーザーが存在しない場合は所定の例外を発生させる
            throw new UsernameNotFoundException("user not found");
        }
     // 権限List作成（今回の例では認可は使わないので仮で"GENERAL"を与える）
                GrantedAuthority authority = new SimpleGrantedAuthority("GENERAL");
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(authority);

                // UserDetails作成
                UserDetails userDetails = (UserDetails) new User(username,password, authorities);

                return userDetails;
            }
        }