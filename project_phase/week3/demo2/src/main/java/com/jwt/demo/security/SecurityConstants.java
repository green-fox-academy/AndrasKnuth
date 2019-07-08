package com.jwt.demo.security;

public class SecurityConstants {
  public static final String SECRET = "SecretKeyToGenJWTs";
  public static final long EXPIRATION_TIME = 900_000; // 15 min
  public static final String TOKEN_PREFIX = "Bearer ";
  public static final String HEADER_STRING = "Authorization";
  public static final String SIGN_UP_URL = "/users/sign-up";
}
