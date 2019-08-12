package ac.za.cput.factory.demographic;

import ac.za.cput.domain.demographic.Race;
import ac.za.cput.util.Misc;

public class RaceFactory {

    public static Race getRaceName(String raceName){
        return new Race.Builder()
                .raceName( "Black" )
                .raceId( Misc.generateId())
                .build();
    }
}
