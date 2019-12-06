package com.meetstone.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;


import com.meetstone.project.dao.entity.AcountEntity;
import com.meetstone.project.service.impl.AcountImpl;


/**
 * Created by shuai on 2017/5/21.
 */
@Controller
public class DemoController {
	
	@Autowired
	AcountImpl acountServer;
	@SuppressWarnings("unchecked")
	@RequestMapping("/Get/Test")
    @ResponseBody
    String home() {
		JSONArray jsonObject = new JSONArray();
		List<AcountEntity> acountEntity = acountServer.GetAllInfo();
		for (AcountEntity acount : acountEntity) {
			JSONObject childJsonObject = new JSONObject();
			childJsonObject.put("userID", acount.getAcount_id());
			childJsonObject.put("userName", acount.getAcount_name());
			childJsonObject.put("userPsd",acount.getAcount_passwrod());
			childJsonObject.put("userRole",acount.getAcount_role());
			jsonObject.add(childJsonObject);
		}
		
        return jsonObject.toJSONString();
    }

}
