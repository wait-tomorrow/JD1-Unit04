package by.htp.Aggregation.Task01;

public class Word {
    private String word;

    public Word(String word) {
	this.word = word;
    }

    public String getWord() {
	return word;
    }

    public void setWord(String word) {
	this.word = word;
    }

    @Override
    public String toString() {
	return "Word: " + word;
    }
}
