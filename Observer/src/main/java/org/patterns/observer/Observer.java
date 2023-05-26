package org.patterns.observer;

// Observer (Наблюдатель)
public interface Observer {
    void update(boolean currentProgressCreatedInTime, String professorName);
}