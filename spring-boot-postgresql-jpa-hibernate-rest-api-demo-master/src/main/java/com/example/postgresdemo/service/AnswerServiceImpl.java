package com.example.postgresdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.postgresdemo.model.Answer;
import com.example.postgresdemo.repository.IAnswerDao;

@Service
public class AnswerServiceImpl implements IAnswerService {
	
	@Autowired	
	private SessionFactory session;
	
	@Autowired 
	private IAnswerDao iAnswerDao;
	
	@Override
	@Transactional
	public List<Answer> fetchAnswerslist() {
		return iAnswerDao.fetchAnswerDao(session);
	}

}
