package com.company.common.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.log4j.Log4j2;

@Log4j2
//@Component
public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {

 @Override
 public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
 throws IOException, ServletException {

 log.warn("Login Success");

 List<String> roleNames = new ArrayList<>();

 auth.getAuthorities().forEach(authority -> {

 roleNames.add(authority.getAuthority());

 });

 log.warn("ROLE NAMES: " + roleNames);

 if (roleNames.contains("ROLE_ADMIN")) {

 response.sendRedirect("/admin");
 return;
 }

 if (roleNames.contains("ROLE_USER")) {

 response.sendRedirect("/member");
 return;
 }

 response.sendRedirect("/");
	}
}