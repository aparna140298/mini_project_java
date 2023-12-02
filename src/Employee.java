import java.time.Year;
public class Employee {

    final static int GAIN_FACTOR_CLIENT = 500;
    final static int GAIN_FACTOR_TRAVEL = 100;
    final static int GAIN_FACTOR_ERROR = 10;
    final static int GAIN_FACTOR_PROJECTS = 200;
    private String name;
    private int birthYear;
    private Vehicle vehicle;
    private Contract contract;

    public Employee(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
        display();
    }

    public Employee(String name, int birthYear, Vehicle vehicle) {
        this.name = name;
        this.birthYear = birthYear;
        this.vehicle = vehicle;
        display();
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }
    public Vehicle vehicle(){
        return vehicle;
    }

    public double annualIncome(){
        return 0;
    }



    public int getAge(){
        int currentYear = Year.now().getValue();
        return currentYear - birthYear;
    }

    public String getEmployeeType(){
        return "Employee";
    }

    public void signContract(Contract contract) {
        this.contract = contract;
    }

    public Contract contract() {
        return contract;
    }

    public String contractInfo() {
        String info = name + ", is a " + getEmployeeType() + contract.toString();
        return info;
    }

    public void display(){
        System.out.println("We have a new Employee: " + name + ", a " + getEmployeeType());
    }

    public String toString(){
        String emp_details = name + ", a " + getEmployeeType() + "\n" +
                "Age: " + getAge() + "\n" + vehicle.toString();
        return emp_details;
    }

    public int getOccupationRate(int rate){
        if (rate > 100) {
            return 100;
        } else if (rate < 10 && rate > 0) {
            return 10;
        } else {
            return rate;
        }
    }
}