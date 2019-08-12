package ac.za.cput.domain.user;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Employee {

    private String empId, empName, empSurname;

    private Employee(){}

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public Employee(Builder builder){

        this. empId= builder.empId;
        this.empName=builder.empName;
        this.empSurname=builder.empSurname;
    }

    public static class Builder {

        private String empId, empName, empSurname;

        public Builder empId(String empId){
            this.empId = empId;
            return this;
        }

        public Builder empName(String empName){
            this.empName = empName;
            return this;
        }

        public Builder empSurname(String empSurname){
            this.empSurname = empSurname;
            return this;
        }

        public Builder copy (Employee employee){
            this.empId = employee. empId;
            this.empName = employee.empName;
            this.empSurname = employee.empSurname;
            return this;
        }

        public Employee build(){
            return new Employee( this );
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNumber='" +  empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empSurname='" + empSurname + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() !=obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return employee.equals(((Employee) obj).getEmpId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(  empId );
    }
}
