package model;
import repo.TimetableTrains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class TimetableElectricTrain implements TimetableTrains {
    @Override
    public String[] getTimetable() {
        System.out.println("обращаемся к getTimetable");

        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("src/main/resources/trainDeparture.txt")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error:  " + e);
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        String[] timetable = getTimetable();

        for(int i = 0; i<timetable.length; i++) {
            if(timetable[i].startsWith(trainId+";"))
                return timetable[i];
        }

        return "";
    }
}
