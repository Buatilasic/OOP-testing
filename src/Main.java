import java.util.Scanner;

import java.util.ArrayList;


class User{

    private int id;

    private String username;

    public User(int id, String username) {

        this.id = id;

        this.username = username;

    }

    public int getId() {

        return id;

    }

    public String getUsername() {

        return username;

    }

}


class Question {

    private int id;

    private String questionText;

    private String answerText;

    public Question(int id, String questionText, String answerText) {

        this.id = id;

        this.answerText = answerText;

        this.questionText = questionText;

    }

    public int getId(){

        return id;

    }

    public String getQuestionText(){

        return questionText;

    }

    public String getAnswerText(){

        return answerText;

    }

}


public class Main {

    public static void main(String[] args) {

        User user1 = new User(0, "Buatilasic");

        User user2 = new User(1, "Aiva");

        System.out.println("Пользователь " + user1.getUsername() + " имеет id " + user1.getId());

        System.out.println("Пользователь " + user2.getUsername() + " имеет id " + user2.getId());

        Question question1 = new Question(0, "Какой сейчас год?", "2025");

        Question question2 = new Question(1, "Сколько пальцев на руке у среднестатистического человека?", "5");

        System.out.println("Вопрос №" + question1.getId() + ": " + question1.getQuestionText() + " Ответ: " + question1.getAnswerText());

        System.out.println("Вопрос №" + question2.getId() + ": " + question2.getQuestionText() + " Ответ: " + question2.getAnswerText());

    }

}