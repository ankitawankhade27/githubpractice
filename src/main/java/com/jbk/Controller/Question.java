package com.jbk.Controller;

import org.springframework.stereotype.Component;

@Component
public class Question {
	
	private String Question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String CorrectAnswer;
	private String Explaination;
	public Question() {
		super();
	}
	public Question(String question, String option1, String option2, String option3, String option4,
			String correctAnswer, String explaination) {
		super();
		Question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		CorrectAnswer = correctAnswer;
		Explaination = explaination;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getCorrectAnswer() {
		return CorrectAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		CorrectAnswer = correctAnswer;
	}
	public String getExplaination() {
		return Explaination;
	}
	public void setExplaination(String explaination) {
		Explaination = explaination;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CorrectAnswer == null) ? 0 : CorrectAnswer.hashCode());
		result = prime * result + ((Explaination == null) ? 0 : Explaination.hashCode());
		result = prime * result + ((Question == null) ? 0 : Question.hashCode());
		result = prime * result + ((option1 == null) ? 0 : option1.hashCode());
		result = prime * result + ((option2 == null) ? 0 : option2.hashCode());
		result = prime * result + ((option3 == null) ? 0 : option3.hashCode());
		result = prime * result + ((option4 == null) ? 0 : option4.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (CorrectAnswer == null) {
			if (other.CorrectAnswer != null)
				return false;
		} else if (!CorrectAnswer.equals(other.CorrectAnswer))
			return false;
		if (Explaination == null) {
			if (other.Explaination != null)
				return false;
		} else if (!Explaination.equals(other.Explaination))
			return false;
		if (Question == null) {
			if (other.Question != null)
				return false;
		} else if (!Question.equals(other.Question))
			return false;
		if (option1 == null) {
			if (other.option1 != null)
				return false;
		} else if (!option1.equals(other.option1))
			return false;
		if (option2 == null) {
			if (other.option2 != null)
				return false;
		} else if (!option2.equals(other.option2))
			return false;
		if (option3 == null) {
			if (other.option3 != null)
				return false;
		} else if (!option3.equals(other.option3))
			return false;
		if (option4 == null) {
			if (other.option4 != null)
				return false;
		} else if (!option4.equals(other.option4))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Question [Question=" + Question + ", option1=" + option1 + ", option2=" + option2 + ", option3="
				+ option3 + ", option4=" + option4 + ", CorrectAnswer=" + CorrectAnswer + ", Explaination="
				+ Explaination + "]";
	}
	
	
	

}
