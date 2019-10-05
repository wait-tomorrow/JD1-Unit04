package by.htp.Aggregation.Task01;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово. 
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 */

public class Task01 {

    public static void main(String[] args) {
	Sentence sentence = new Sentence();
	sentence.add(new Word("Hello"));
	sentence.add(new Word("Java"));
	sentence.add(new Word("World!"));

	Text text = new Text();
	text.append(sentence);

	Sentence headText = new Sentence();
	headText.add(new Word("Say hello!"));
	text.setHead(headText);

	printText(text);
    }

    private static void printText(Text text) {
	for (Word word : text.getHead().getWords()) {
	    System.out.print(word.getWord() + " ");
	}

	System.out.println();
	for (Sentence sentence : text.getText()) {
	    for (Word word : sentence.getWords()) {
		System.out.print(word.getWord() + " ");
	    }
	}
    }
}
