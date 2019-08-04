package ac.za.cput.factory;

import ac.za.cput.domain.Race;
import ac.za.cput.util.Misc;

public class RaceFactory {

    public static Race getRaceName(String raceName){
        return new Race.Builder()
                .raceName( "Black" )
                .id( Misc.generateId())
                .build();
    }
}
