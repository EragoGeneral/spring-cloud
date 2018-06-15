package com.ruiyang.floweryoung.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * 
 * @author henrylin
 *
 */
@RestController
@RequestMapping("/report")
public class ReportController {

	@RequestMapping(value="/list", method=RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> list(){
		Map<String, Object> result = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		result.put("data", list);
		
		return result;
	}
}
