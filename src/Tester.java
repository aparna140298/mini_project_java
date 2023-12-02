public class Tester extends Employee{
    private int nbBugs;
    private int rate;

    double baseRate = 0;

    public Tester(String name, int birthYear, int nbBugs, int rate){
        super(name, birthYear);
        this.nbBugs = nbBugs;
        this.rate = super.getOccupationRate(rate);;
    }

    public Tester(String name, int birthYear, int nbBugs, int rate, Vehicle vehicle){
        super(name, birthYear, vehicle);
        this.nbBugs = nbBugs;
        this.rate = super.getOccupationRate(rate);;
    }

    public int getNbBugs() {
        return nbBugs;
    }

    public int getRate() {
        return rate;
    }
    @Override
    public String getEmployeeType(){
        return "Tester";
    }

    @Override
    public double annualIncome(){
        double income = 0;
        income = ((12 * baseRate) * rate) + nbBugs * GAIN_FACTOR_ERROR;
        return income;
    }

    public String toString(){
        String tester_details = super.toString() + "\n" + getName() + " has an occupation rate: " + getRate() + "%" +
                " and corrected " + getNbBugs() + " bugs.\nHis/Her estimated annual Income is " + annualIncome();
        return tester_details;
    }
}
