package org.patterns.subject;


import org.patterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * observerList - лист с наблюдателями
 * professorName - имя профессора, просрочившего дедлайн
 * currentProgressCreatedInTime - вовремя/невовремя
 */
public class Database {
    private List<Observer> observerList = new ArrayList<>();
    private boolean currentProgressCreatedInTime;
    private String professorName;

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void setCurrentProgressCreatedInTime(boolean currentProgressCreatedInTime, String professorName) {
        this.currentProgressCreatedInTime = currentProgressCreatedInTime;
        this.professorName = professorName;

        notifyObservers();
    }

    public void notifyObservers() {
        for (var obs : observerList) {
            obs.update(currentProgressCreatedInTime, professorName);
        }
    }
}