package com.meetstone.project.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.meetstone.project.MySHA512;
import com.meetstone.project.dao.entity.AcountEntity;
import com.meetstone.project.service.impl.AcountImpl;

@Controller
@RequestMapping("/Acount/API")
public class AcountController {
	
	
	@Autowired
	AcountImpl acountServer;
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/signup",method = RequestMethod.POST)
	@ResponseBody
	public String SignUp(String username,String password) {
		MySHA512 mySHA512 = new MySHA512();
		boolean Success = false;
		int Error = -1;
		String infomation = "";
		String id = mySHA512.getId();
		String name = username;
		String role = "0";
		AcountEntity acount = new AcountEntity(id, name, password, role);
		try {
			acountServer.SignUp(acount);
			Success = true;
		} catch (Exception e) {
			// TODO: handle exception
			Error = 1024;
			Success = false;
		}
		JSONObject jsonObject= new JSONObject();
		jsonObject.put("success", Success);
		jsonObject.put("Error", Error);
		infomation = jsonObject.toJSONString();
		return infomation;
	}
}
