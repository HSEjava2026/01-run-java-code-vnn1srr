package ru.hse.lab1;
import ru.hse.lab1.second.Person;

/**
 * Вывод данных о человеке
 * 
 * @author - Ширяев Иван Алексеевич
 * @version  - 1.0
 * @since - 2026
 */

public class Main {
    public static void main(String[] args) {
        Person per = new Person("Иван", 20);
        System.out.println("Имя: " + per.name + "\nВозраст: " + per.age);
    }
}