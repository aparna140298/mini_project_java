// Permanent.java
// Permanent.java
public class Permanent implements Contract {
    private int nbChildren;
    private boolean married;
    private double monthlySalary;
    private double bonusPerChildPerMonth;
    private int accumulatedDays;

    public Permanent(int nbChildren, boolean married, double monthlySalary, double bonusPerChildPerMonth, int accumulatedDays) {
        this.nbChildren = nbChildren;
        this.married = married;
        this.monthlySalary = monthlySalary;
        this.bonusPerChildPerMonth = bonusPerChildPerMonth;
        this.accumulatedDays = accumulatedDays;
    }

    @Override
    public double accumulatedSalary() {
        return (accumulatedDays * (monthlySalary + (married ? nbChildren * bonusPerChildPerMonth : 0))) / Management.workingDaysPerMonth;
    }

    @Override
    public String toString() {
        return ". He/She is " +(married ? " married" : " not married")+
                " and " +
                "he/she has " + nbChildren + " children. "+
                "\nHe/She has worked for " + accumulatedDays + " days and upon contract his/her" +
                " monthly salary is " + accumulatedSalary()+"\n";


    }
}


