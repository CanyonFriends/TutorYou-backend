package com.example.wncserver.exception.custom;

public class AccessTokenException extends RuntimeException{

	public AccessTokenException(String message) {
		super("유효하지 않은 AccessToken 입니다. : " + message);
	}
}
