package by.htp.Aggregation.Task01;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> text;
    private Sentence head;

    public Text() {
	text = new ArrayList<Sentence>();
    }

    public void append(Sentence sentence) {
	text.add(sentence);
    }

    public List<Sentence> getText() {
	return text;
    }

    public void setText(List<Sentence> text) {
	this.text = text;
    }

    public Sentence getHead() {
	return head;
    }

    public void setHead(Sentence head) {
	this.head = head;
    }

    @Override
    public String toString() {
	return "Text: [Head: " + head + "] [Sentences: " + text + "]";
    }

}
