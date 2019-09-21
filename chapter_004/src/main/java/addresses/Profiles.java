package addresses;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
        List<Address> uniqueAddresses = addresses.stream().distinct().collect(Collectors.toList());
        uniqueAddresses.sort(new Comparator<Address>() {
            @Override
            public int compare(Address o1, Address o2) {
                return o1.getCity().compareTo(o2.getCity());
            }
        });
        return uniqueAddresses;
    }


}
