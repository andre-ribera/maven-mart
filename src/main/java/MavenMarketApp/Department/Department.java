package MavenMarketApp.Department;

public abstract class Department {
    protected byte numEmployees;

    //TODO: make constructor


    public byte getNumEmployees() {
        return numEmployees;
    }

    public void setNumEmployees(byte numEmployees) {
        this.numEmployees = numEmployees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "numEmployees=" + numEmployees +
                '}';
    }
}
