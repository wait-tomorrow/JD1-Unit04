package by.htp.Aggregation.Task01;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Word> words;

    public void add(Word word) {
	words.add(word);
    }

    public Sentence() {
	this.words = new ArrayList<Word>();
    }

    public List<Word> getWords() {
	return words;
    }

    public void setWords(List<Word> sentence) {
	this.words = sentence;
    }

    @Override
    public String toString() {
	return "Words: " + words;
    }

}
