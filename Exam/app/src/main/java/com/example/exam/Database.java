package com.example.exam;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Question> questions;

    public Database() {
        questions = new ArrayList<>();

        questions.add(new Question("Яка найбільше поширенна мова програмування?", new String[]{"Java", "Python", "C++", "JavaScript"}, 1));
        questions.add(new Question("Який принцип ООП описує здатність об'єкта виконувати різні дії?", new String[]{"Абстракція", "Інкапсуляція", "Наслідування", "Поліморфізм"}, 3));
        questions.add(new Question("Яка структура даних використовується для збереження даних впорядкованими парами ключ-значення?", new String[]{"Масив", "Список", "Хеш-таблиця", "Дерево"}, 2));
        questions.add(new Question("Яка функція використовується для введення даних з клавіатури в мові Java?", new String[]{"input()", "read()", "get()", "Scanner()"}, 3));
        questions.add(new Question("Яка оператор використовується для перевірки рівності двох значень в мові Java?", new String[]{"==", "=", " !=", "==="}, 0));
        questions.add(new Question("Яка найбільша планета у Сонячній системі?", new String[]{"Марс", "Сатурн", "Земля", "Юпітер"}, 3));
        questions.add(new Question("Який країнний прапор має зелено-білі смуги та червоний кут?", new String[]{"Франція", "Італія", "Німеччина", "Бангладеш"}, 3));
        questions.add(new Question("Яка найбільша океанська глибина?", new String[]{"1000 метрів", "5000 метрів", "10000 метрів", "11034 метри"}, 3));
        questions.add(new Question("Який метал є найдорожчим у світі?", new String[]{"Золото", "Срібло", "Платина", "Ртуть"}, 2));
        questions.add(new Question("Яка планета є найближчою до Сонця?", new String[]{"Меркурій", "Венера", "Земля", "Марс"}, 0));
    }

    public Database(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
