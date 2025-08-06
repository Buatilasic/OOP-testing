import java.util.Scanner;

import java.util.ArrayList;


class User{

    int id;

    String username;

}


class Question {

    int id;

    String questionText;

    String answerText;

}


public class Main {

    public static void main(String[] args) {

        User user1 = new User();

        user1.id = 0;

        user1.username = "Buatilasic";

        User user2 = new User();

        user2.id = 1;

        user2.username = "Aiva";

        System.out.println("Пользователь " + user1.username + " имеет id " + user1.id);

        System.out.println("Пользователь " + user2.username + " имеет id " + user2.id);

        Question question1 = new Question();

        question1.id = 1;

        question1.questionText = "Какой сейчас год?";

        question1.answerText = "2025";

        System.out.println("Вопрос №" + question1.id + ": " + question1.questionText + " Ответ: " + question1.answerText);

    }

}