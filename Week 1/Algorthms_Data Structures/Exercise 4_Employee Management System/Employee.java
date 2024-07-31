public class Employee {
  private String employeeId;
  private String name;
  private String position;
  private int salary;

  public Employee(String employeeId, String name, String position, int salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.position = position;
    this.salary = salary;
  }

  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Employee ID: " + employeeId + "\nEmployee Name: " + name + "\nPosition: " + position + "\nSalary: " + salary
        + "\n";
  }
}