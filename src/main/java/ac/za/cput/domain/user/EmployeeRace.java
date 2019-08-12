package ac.za.cput.domain.user;

public class EmployeeRace {

    private  String empId, raceId;

    public EmployeeRace(){
    }
    private EmployeeRace(Builder builder) {
        this.raceId = builder.raceId;
        this.empId = builder.empId;
    }

    public String getEmpId() {
        return empId;
    }

    public String getRaceId() {
        return raceId;
    }

    public  EmployeeRace employeeRace (String raceId, String empId){
        this.empId = empId;
        this.raceId = raceId;
        return this;
    }
    public static class Builder {
        private String empId, raceId;

        public Builder raceId(String raceId) {
            this.raceId = raceId;
            return this;
        }

        public Builder empId(String empId) {
            this.empId = empId;
            return this;
        }

        public EmployeeRace build() {
            return new EmployeeRace( this );
        }
    }
    @Override
    public String toString() {
        return "EmployeeRace{" +
                "empId='" + empId + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }
}
