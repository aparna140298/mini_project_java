// Temporary.java
// Temporary.java
public class Temporary implements Contract {
    private double hourlySalary;
    private int accumulatedHours;

    public Temporary(double hourlySalary, int accumulatedHours) {
        this.hourlySalary = hourlySalary;
        this.accumulatedHours = accumulatedHours;
    }

    @Override
    public double accumulatedSalary() {
        return accumulatedHours * hourlySalary;
    }

    @Override
    public String toString() {
        return ". He/She is a temporary employee with " +
                 hourlySalary + " hourly salary and he worked for " +
               accumulatedHours + " hours\n";

    }
}


