package com.example.postgresdemo.repository;

import java.util.List;

import org.hibernate.SessionFactory;

import com.example.postgresdemo.model.Answer;

public interface IAnswerDao {
	
List<Answer> fetchAnswerDao(SessionFactory session);

}
