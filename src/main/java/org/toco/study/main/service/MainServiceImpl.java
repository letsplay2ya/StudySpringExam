package org.toco.study.main.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.toco.study.main.mapper.MainMapper;
import org.toco.study.main.vo.SampleVO;

@Service
public class MainServiceImpl implements MainService {
	
	@Resource
	private MainMapper mainMapper;

	@Override
	public List<SampleVO> getInfo() {
		List<SampleVO> voList = mainMapper.getInfo();
		return voList;
	}
	
}

