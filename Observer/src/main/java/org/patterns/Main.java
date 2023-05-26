package org.patterns;


import org.patterns.observer.Deanery;
import org.patterns.observer.Observer;
import org.patterns.subject.Database;



// Пример использования
public class Main {
    public static void main(String[] args) {
        // Создание субъекта (базы данных)
        Database database = new Database();

        // Создание наблюдателей (деканатов) и их регистрация в субъекте
        Observer deanery1 = new Deanery("Department 1");
        Observer deanery2 = new Deanery("Department 2");
        database.addObserver(deanery1);
        database.addObserver(deanery2);

        // Преподаватель создает текущую успеваемость и размещает ее в базе данных
        // В данном случае, текущая успеваемость не создана вовремя
        database.setCurrentProgressCreatedInTime(false, "Pluzhnikov Ilya Anatolyevich");
        database.setCurrentProgressCreatedInTime(false, "Dmitry G. Povarov");
        database.setCurrentProgressCreatedInTime(false, "Shmelev Stepan Ivanovich");

    }
}