package com.springsecurity.springsecurityProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class AppUser implements UserDetails {

    @Autowired
    AppUserDetailsService appUserDetailsService;
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserDao userDao;
    private String username;
    private String password;
    List<GrantAuthorityImpl> grantAuthorities;
    public AppUser(String username, String password, List<GrantAuthorityImpl> grantAuthorities) {
        this.username = username;
        this.password = password;
        this.grantAuthorities = grantAuthorities;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        System.out.println("get authorities");
        return grantAuthorities;
    }
    @Override
    public String getPassword()
    {
        System.out.println(password);
        return password;
    }
    @Override
    public String getUsername() {
        return username;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }
}