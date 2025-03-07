public class FullTimeEmployee extends employee {
    private double monthlysalary;

    public FullTimeEmployee(String name, int id,double monthlysalary) {
        super(name, id);
        this.monthlysalary=monthlysalary;
    }

    @Override
    public double calculateSalary() {
        return monthlysalary;
    }
}
