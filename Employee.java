public class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double allowances;
    private double deductions;

    public Employee(String name, int id, double basicSalary) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = 0;
        this.deductions = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getAllowances() {
        return allowances;
    }

    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public double calculateGrossSalary() {
        return basicSalary + allowances;
    }

    public double calculateNetSalary() {
        return calculateGrossSalary() - deductions;
    }

    public String generateSalarySlip() {
        return String.format(
                "Salary Slip\n" +
                        "-------------------------\n" +
                        "Name: %s\n" +
                        "ID: %d\n" +
                        "Basic Salary: %.2f\n" +
                        "Allowances: %.2f\n" +
                        "Deductions: %.2f\n" +
                        "Gross Salary: %.2f\n" +
                        "Net Salary: %.2f\n" +
                        "-------------------------\n",
                name, id, basicSalary, allowances, deductions, calculateGrossSalary(), calculateNetSalary()
        );
    }
}
