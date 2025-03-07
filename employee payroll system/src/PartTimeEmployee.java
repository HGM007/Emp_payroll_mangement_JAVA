public class PartTimeEmployee extends employee{
    private int hourworked;
    private double hourlyrate;

    public PartTimeEmployee(String name, int id,int hourworked,double hourlyrate) {
        super(name, id);
        this.hourworked=hourworked;
        this.hourlyrate=hourlyrate;
    }

    @Override
    public double calculateSalary() {
        return hourworked*hourlyrate;
    }
}
