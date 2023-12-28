package com.lmobile.back.security.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.stereotype.Component;

import com.lmobile.back.security.model.business.CustomUserDetails;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtilityService {

  
  private final SecretKey HASH_KEY = Keys.hmacShaKeyFor(Decoders.BASE64.decode("1m0b113001m0b113001m0b113001m0b113001m0b113001m0b11300"));
  private final long JWT_VALIDITY = 604800000; // in ms | 604800000 is 7 days



//generate jwt
  
 public String generateToken(CustomUserDetails customUserDetails) {
   Map<String, Object> claims = new HashMap<>();
   claims.put("authorities", customUserDetails.getAuthorities());
   return createToken(claims, customUserDetails.getUsername());
 }

 private String createToken(Map<String, Object> claims, String subject) {
   return Jwts.builder()
     .setClaims(claims)
     .setSubject(subject)
     .setIssuedAt(new Date(System.currentTimeMillis()))
     .setExpiration(new Date(System.currentTimeMillis() + JWT_VALIDITY))
     .signWith(HASH_KEY, SignatureAlgorithm.HS256)
     .compact();
 }
 
 
 // extract claims from jwt
 
 public String extractUsername(String jwt) {
   return extractAllClaims(jwt).getSubject();
 }
 
 public Date extractExpiration(String jwt) {
   return extractAllClaims(jwt).getExpiration();
 }

 private Claims extractAllClaims(String token) {
   return Jwts.parserBuilder().setSigningKey(HASH_KEY).build()
     .parseClaimsJws(token)
     .getBody();
 }
 
 
 // perform checks on jwt

 public Boolean validateToken(String token, CustomUserDetails customUserDetails) {
   final String username = extractUsername(token);
   return (username.equals(customUserDetails.getUsername()) && !isTokenExpired(token));
 }

 private Boolean isTokenExpired(String token) {
   return extractExpiration(token).before(new Date());
 }
}
