package ru.user.lab_1.myapp;

import ru.user.lab_1.mylib.Deck;
import ru.user.lab_1.mylib.CardSelector;

public class Application {

	public static void main(String[] args) {
		Deck deck = new Deck();
        CardSelector.chooseCard();
	}
}