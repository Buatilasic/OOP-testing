import java.util.HashMap;
import  java.util.ArrayList;
import java.util.List;

class User{
    private int id;
    private String username;
    private List<Question> questions;
    public User(int id, String username) {
        this.id = id;
        this.username = username;
        this.questions = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public List<Question> getQuestions() {
        return questions;
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
        HashMap<Integer, User> userMap = new HashMap<>();
        HashMap<Integer, Question> questionMap = new HashMap<>();
        User user1 = new User(0, "Buatilasic");
        User user2 = new User(1, "Aiva");
        userMap.put(user1.getId(), user1);
        userMap.put(user2.getId(), user2);
        Question question1 = new Question(0, "Какой сейчас год?", "2025");
        Question question2 = new Question(1, "Сколько пальцев на руке у среднестатистического человека?", "5");
        user1.addQuestion(question1);
        user2.addQuestion(question2);
        questionMap.put(question1.getId(), question1);
        questionMap.put(question2.getId(), question2);
        for (int i : userMap.keySet()) {
            User retrievedUser = userMap.get(i);
            System.out.println("У пользователя с id" + i + " загружено имя " + retrievedUser.getUsername());
            System.out.println("Список вопросов пользователя:");
            for (Question q : retrievedUser.getQuestions()) {
                System.out.println("- " + q.getQuestionText());
            }
        }
        for (int i : questionMap.keySet()) {
            Question retrievedQuestion = questionMap.get(i);
            System.out.println("Вопрос id" + i + ": " + retrievedQuestion.getQuestionText() + " Ответ: " + retrievedQuestion.getAnswerText());
        }
    }

}