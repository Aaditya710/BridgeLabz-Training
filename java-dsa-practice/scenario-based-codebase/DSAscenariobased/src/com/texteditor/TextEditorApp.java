package com.texteditor;

public class TextEditorApp {
	public static void main(String [] args) {
		TextEditor editor = new TextEditor();
		
		editor.insertText("Hello");
		editor.insertText(" World");
		editor.showText();
		
		editor.deleteText(6);
		editor.showText();
		
		editor.undo();
		editor.showText();
		
		editor.redo();
		editor.showText();
	}

}
