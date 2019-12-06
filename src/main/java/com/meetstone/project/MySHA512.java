package com.meetstone.project;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class MySHA512 {
	public String getId(){
		String id=UUID.randomUUID().toString();
		id=id.replace("-", "");
		return id;
	}

}
