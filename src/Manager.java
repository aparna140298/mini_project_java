public class Manager extends Employee{
    private int nbClients;
    private int nbTravelDays;
    private int rate;

    double baseRate = 0;
    public Manager(String name, int birthYear, int nbClients, int nbTravelDays) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = 100;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate) {
        super(name, birthYear);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = super.getOccupationRate(rate);
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = 100;
    }

    public Manager(String name, int birthYear, int nbClients, int nbTravelDays, int rate, Vehicle vehicle) {
        super(name, birthYear, vehicle);
        this.nbClients = nbClients;
        this.nbTravelDays = nbTravelDays;
        this.rate = super.getOccupationRate(rate);
    }

    public int getNbClients() {
        return nbClients;
    }
    public int getNbTravelDays() {
        return nbTravelDays;
    }

    public int getRate() {
        return rate;
    }
    @Override
    public String getEmployeeType(){
        return "Manager";
    }

    @Override
    public double annualIncome(){
        double income = 0;
        income = ((12 * baseRate) * rate) + (nbClients * GAIN_FACTOR_CLIENT) + (nbTravelDays * GAIN_FACTOR_TRAVEL);
        return income;
    }

    public String toString(){
        String manager_details = super.toString() + "\n" + getName() + " has an occupation rate: " + getRate() + "%" +
                " He/She travelled " + getNbTravelDays() + " days and has brought " + getNbClients() + " new clients.\n" +
                "His/Her estimated annual Income is " + annualIncome();
        return manager_details;
    }
}
