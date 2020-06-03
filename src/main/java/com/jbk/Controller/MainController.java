package com.jbk.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testApi")

public class MainController {
	//created by Ankita
	public Question getQuestion() {
		
		Question question=new Question();
		question.setQuestion("Is java platform Independent??");
		question.setOption1("YES");
		question.setOption2("No");
		question.setCorrectAnswer("1");
		question.setExplaination("due to byte code...which is independet to operating system");
		return question;
		
	}
	
	public Subject getSubject() {
		
		Subject subject=new Subject();
		subject.setSubId(10);
		subject.setSubName("java");
		return subject;
	}

}
