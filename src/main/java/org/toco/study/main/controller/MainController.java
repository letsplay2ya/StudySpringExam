package org.toco.study.main.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.toco.study.main.service.MainService;
import org.toco.study.main.vo.SampleVO;


@Controller
public class MainController {
	
	@Resource
	private MainService mainService;
	
	//샘플
	@RequestMapping(value = "index.do")
	public String sample(Model model) {
		List<SampleVO> voList = mainService.getInfo();
		model.addAttribute("sampleList", voList);
		return "index";
	}	
}