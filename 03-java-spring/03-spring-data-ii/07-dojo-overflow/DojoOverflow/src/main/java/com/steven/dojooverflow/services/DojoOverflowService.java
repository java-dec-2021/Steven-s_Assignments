package com.steven.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.steven.dojooverflow.models.Answer;
import com.steven.dojooverflow.models.NewQuestion;
import com.steven.dojooverflow.models.Question;
import com.steven.dojooverflow.models.Tag;
import com.steven.dojooverflow.repositories.AnswerRepository;
import com.steven.dojooverflow.repositories.QuestionRepository;
import com.steven.dojooverflow.repositories.TagRepository;

@Service
public class DojoOverflowService {
	private QuestionRepository qRepo;
	private TagRepository tRepo;
	private AnswerRepository aRepo;
	public DojoOverflowService(QuestionRepository qRepo, AnswerRepository aRepo, TagRepository tRepo) {
		this.qRepo = qRepo;
		this.tRepo = tRepo;
		this.aRepo = aRepo;
	}
	public List<Question> getQuestions() {
		return this.qRepo.findAll();
	}
	public Question getQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	public void createQuestion(NewQuestion question) {
		
		List<Tag> questionsTags = new ArrayList<Tag>();
		for(String subject: question.splitTags()) {
			Tag tag = this.tRepo.findBySubject(subject).orElse(null);
			if(tag == null) {
				tag = new Tag(subject);
				this.tRepo.save(tag);
			}
		
			if(!questionsTags.contains(tag))
				questionsTags.add(tag);
		}
		Question newQuestion = new Question(question.getQuestion(), questionsTags);
		this.qRepo.save(newQuestion);
	}
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}