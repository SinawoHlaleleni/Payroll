package ac.za.cput.domain.demographic;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@EntityScan
public class Gender {
    private String gendId, genderType;

    private Gender() {
    }

    public String getGendId() {
        return gendId;
    }

    public String getGenderType() {
        return genderType;
    }

    public Gender(Builder builder) {

        this.gendId = builder.gendId;
        this.genderType = builder.genderType;
    }

    public static class Builder {

        private String gendId, genderType;

        public Builder gendId(String gendId) {
            this.gendId = gendId;
            return this;
        }

        public Builder genderType(String genderType) {
            this.genderType = genderType;
            return this;
        }


        public Builder copy(Gender gender) {
            this.genderType = gender.genderType;
            this.gendId = gender.gendId;
            return this;
        }

        public Gender build() {
            return new Gender( this );
        }

    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + gendId + '\'' +
                ", genderType='" + genderType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Gender)) return false;
        Gender gender = (Gender) o;
        return gendId.equals( gender.gendId );
    }

    @Override
    public int hashCode() {
        return Objects.hash( gendId);
    }
}