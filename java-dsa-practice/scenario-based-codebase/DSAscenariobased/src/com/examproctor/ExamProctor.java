package com.examproctor;

import java.util.HashMap;
import java.util.Stack;

public class ExamProctor {
	Stack <Integer> navigationStack = new Stack<>();
	HashMap<Integer, String> answersMap = new HashMap<>();
	HashMap<Integer, String> correctAnswers = new HashMap<>();
	
	ExamProctor(){
		correctAnswers.put(1,  "A");
		correctAnswers.put(2, "B");
		correctAnswers.put(3, "C");
	}
	
	void visitQuestion(int questionId) {
		navigationStack.push(questionId);
		System.out.println("Visited Question: " + questionId);
	}
	
	void submitAnswer(int questionId, String answer) {
		answersMap.put(questionId, answer);
		System.out.println("Answer saved for Question" + questionId);
	}
	
	int calculateScore() {
		int score = 0;
		for(int qId : answersMap.keySet()) {
			if(answersMap.get(qId).equals(correctAnswers.get(qId))) {
				score++;
			}
		}
		return score;
	}
	

}
