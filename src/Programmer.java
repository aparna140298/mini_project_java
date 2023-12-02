public class Programmer extends Employee{
    private int nbProjects;
    private int rate;
    double baseRate = 0;

    public Programmer(String name, int birthYear, int nbProjects) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.rate = 100;
    }
    public Programmer(String name, int birthYear, int nbProjects, int rate) {
        super(name, birthYear);
        this.nbProjects = nbProjects;
        this.rate = super.getOccupationRate(rate);;
    }

    public Programmer(String name, int birthYear, int nbProjects, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
        this.rate = super.getOccupationRate(rate);;
    }

    public Programmer(String name, int birthYear, int nbProjects, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbProjects = nbProjects;
        this.rate = 100;
    }

    public int getRate() {
        return rate;
    }

    public int getNbProjects() {
        return nbProjects;
    }
    @Override
    public String getEmployeeType(){
        return "Programmer";
    }
    @Override
    public double annualIncome(){
        double income = 0;
        income = ((12 * baseRate) * rate) + GAIN_FACTOR_PROJECTS * nbProjects;
        return income;
    }

    public String toString(){
        String progammer_details = super.toString() + "\n" + getName() + " has an occupation rate: " + getRate() + "%" +
                " and completed " + getNbProjects() + " projects.\nHis/Her estimated annual Income is " + annualIncome();
        return progammer_details;
    }
}
