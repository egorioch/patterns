package org.patterns.observer;

public class Deanery implements Observer {
    private String department;

    public Deanery(String department) {
        this.department = department;
    }

    @Override
    public void update(boolean currentProgressCreatedInTime, String professorName) {
        if (!currentProgressCreatedInTime) {
            notifyDepartment(professorName);
        }
    }

    private void notifyDepartment(String professorName) {
        System.out.println("Deanery of department " + department
                + "(professor: " + professorName + ")"
                + ": Current progress was not created in time!");
    }
}