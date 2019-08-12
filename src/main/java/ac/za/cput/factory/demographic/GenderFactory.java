package ac.za.cput.factory.demographic;

import ac.za.cput.domain.demographic.Gender;
import ac.za.cput.util.Misc;

public class GenderFactory {

    public static Gender getGender(String genderType) {
        return new Gender.Builder()
                .genderType("Male")
                .gendId( Misc.generateId())
                .build();
    }
}

