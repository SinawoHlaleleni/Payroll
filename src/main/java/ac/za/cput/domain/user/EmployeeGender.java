package ac.za.cput.domain.user;

public class EmployeeGender {

    private String empId,gendId;

    public EmployeeGender(String empId, String gendId){}

    private EmployeeGender(Builder builder) {
        this.gendId = builder.gendId;
        this.empId = builder.empId;
    }
    public String getGendId() {
        return gendId;
    }

    public String getEmpId() {
        return empId;
    }


    public static class Builder{
        private String empId,gendId;

        public  Builder gendId(String gendId){
            this.gendId = gendId;
            return this;
        }
        public  Builder empId(String empId){
            this.empId = empId;
            return this;
        }
        public EmployeeGender build() {
            return new EmployeeGender(this);
        }

    }

    @Override
    public String toString() {
        return "EmployeeGender{" +
                "empId='" + empId + '\'' +
                ", gendId='" + gendId + '\'' +
                '}';
    }
}
