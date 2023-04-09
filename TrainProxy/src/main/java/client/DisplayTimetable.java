package client;

import model.TimetableElectricTrainProxy;
import repo.TimetableTrains;

public class DisplayTimetable {
    private TimetableTrains trains = new TimetableElectricTrainProxy();

    //расписание всех поездов
    public void printTimetable() {
        System.out.println(" ------------------Вывод расписания поездов------------------");
        String[] trainInfo = trains.getTimetable();
        for (var train : trainInfo) {
            System.out.println(train);
        }
    }

    //подходящий по id поезд
}
