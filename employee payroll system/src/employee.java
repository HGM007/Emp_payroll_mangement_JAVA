public abstract class employee {
    private String name;
    private int id;

    public employee(String name , int id) {
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", id=" + id + '\''+", Salary: $" + calculateSalary() +
                '}';
    }
}
