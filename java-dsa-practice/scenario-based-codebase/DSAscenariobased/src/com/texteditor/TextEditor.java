package com.texteditor;
import java.util.Stack;

public class TextEditor {
	private StringBuilder content = new StringBuilder();
	private Stack<Action> undoStack = new Stack<>();
	private Stack<Action> redoStack = new Stack<>();
	
	void insertText(String text) {
		content.append(text);
		undoStack.push(new Action("INSERT", text));
		redoStack.clear();
		System.out.println("INSERTED:" + text);
	}
	
	void deleteText(int length) {
		if(length > content.length()) {
			System.out.println("Delete operation failed!");
			return;
		}
		String deletedText = 
				content.substring(content.length() - length);
		content.delete(content.length() - length, content.length());
		
		undoStack.push(new Action("DELETE", deletedText));
		redoStack.clear();
		System.out.println("Deleted: " + deletedText);
	}
	
	void undo() {
		if(undoStack.isEmpty()) {
			System.out.println("Nothing to undo");
			return;
		}
		
		Action action = undoStack.pop();
		if(action.type.equals("INSERT")) {
			content.delete(content.length() - action.text.length(), content.length());
		}else if(action.type.equals("DELETE")) {
			content.append(action.text);
		}
		
		redoStack.push(action);
		System.out.println("Undo Performed");
	}
	
	void redo() {
		if(redoStack.isEmpty()) {
			System.out.println("Nothing to redo");
			return;
		}
		
		Action action = redoStack.pop();
		
		if(action.type.equals("INSERT")) {
			content.append(action.text);
		} else if(action.type.equals("DELETE")) {
			content.delete(content.length() - action.text.length(), content.length());
		}
		
		undoStack.push(action);
		System.out.println("Redo Performes");
	}
	
	void showText() {
		System.out.println("Current Text: " + content);
	}
}

