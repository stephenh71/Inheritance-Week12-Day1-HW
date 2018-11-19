package Staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) { throw new IllegalArgumentException("Name cannot be blank");}
        this.name = name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double raiseSalary(double incrementFactor){
        if (incrementFactor >= 0.00){
            double newSalary =+ this.salary * (+1+incrementFactor);
            return newSalary;
        } else {
            throw new IllegalArgumentException("Salary increase cannot be negative.");
        }
    }

    public double payBonus(){
        double bonus = this.salary * 0.01;
        return bonus;
    }


}
