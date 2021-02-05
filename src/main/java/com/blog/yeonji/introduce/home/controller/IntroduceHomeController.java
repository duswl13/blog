package com.blog.yeonji.introduce.home.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blog.yeonji.introduce.generator.mapper.CmitMemberRecommendMapper;
import com.blog.yeonji.introduce.generator.model.CmitMemberRecommend;

/**
 * Handles requests for the application home page.
 */
@Controller
public class IntroduceHomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(IntroduceHomeController.class);
	
	
	@Autowired
	private CmitMemberRecommendMapper mapper;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info(this.getClass().getName() + ": [프로필 메인]");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
	
		
		CmitMemberRecommend cmit = mapper.selectByPrimaryKey(1);
		return "home";
	}
	
}
