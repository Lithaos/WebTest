package pl.WebTest.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String question;

	private String category;

	private String answerA;
	private String answerB;
	private String answerC;
	private String answerD;

	private String correctAnswer;

	private String author;

	public Question() {
	};

	public Question(String question, String category, String answerA, String answerB, String answerC, String answerD,
			String correctAnswer, String author) {
		super();
		this.question = question;
		this.category = category;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.correctAnswer = correctAnswer;
		this.author = author;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAnswerA() {
		return answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", category=" + category + ", answerA=" + answerA
				+ ", answerB=" + answerB + ", answerC=" + answerC + ", answerD=" + answerD + ", correctAnswer="
				+ correctAnswer + ", author=" + author + "]";
	}

}
