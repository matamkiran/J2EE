package com.example.postgresdemo.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.example.postgresdemo.model.Answer;

@Repository
public class AnswersDaoImplementation implements IAnswerDao{
	
	@Override
	public List<Answer> fetchAnswerDao(SessionFactory session) {
		return session.getCurrentSession().createQuery("From Answer").list();
	}
	

}
