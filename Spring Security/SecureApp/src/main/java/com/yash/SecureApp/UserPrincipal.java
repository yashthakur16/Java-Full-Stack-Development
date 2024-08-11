package com.yash.SecureApp;

import java.util.Collection;
import java.util.Collections;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

public class UserPrincipal implements UserDetails {
	
	
	private logindata2 data;
	
	

	public UserPrincipal(logindata2 data) {
		super();
		this.data = data;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return Collections.singleton(new SimpleGrantedAuthority("USER"));
	}

	@Override
	public String getPassword() {
		
		return data.getPassword();
	}

	@Override
	public String getUsername() {
	
		return data.getUsername();
	}

}
