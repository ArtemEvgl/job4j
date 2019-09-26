package addresses;

import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        List<Address> addresses = profiles.stream().map(profile -> profile.getAddress()).collect(Collectors.toList());
        List<Address> uniqueAddresses = addresses.stream().distinct().collect(Collectors.toList());
        uniqueAddresses.sort((o1,o2) -> o1.getCity().compareTo(o1.getCity()));
        return uniqueAddresses;
    }


}
