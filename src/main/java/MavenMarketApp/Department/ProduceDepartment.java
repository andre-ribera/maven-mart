package MavenMarketApp.Department;

public class ProduceDepartment extends Department {
    private final String deptName = "Produce Department";

    public ProduceDepartment(){
        super();
    }

    public String getDeptName() {
        return deptName;
    }

    @Override
    public String toString() {
        return deptName;
    }
}
