package model;

import repo.TimetableTrains;

public class TimetableElectricTrainProxy implements TimetableTrains {
    //создаем объект лишь единожды, а затем тоже единожды обращаемся к его методу обращения к файлу
    private TimetableTrains trainsDepartmentCash = new TimetableElectricTrain();


    private String[] timetableCash;

    @Override
    public String[] getTimetable() {
        if (timetableCash == null) {
            timetableCash = trainsDepartmentCash.getTimetable();
        }

        return timetableCash;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        if (timetableCash == null) {
            timetableCash = trainsDepartmentCash.getTimetable();
        }

        for(int i = 0; i<timetableCash.length; i++) {
            if(timetableCash[i].startsWith(trainId+";"))
                return timetableCash[i];
        }

        return "";
    }

    public void cacheSetNull() {
        trainsDepartmentCash = null;
    }
}
