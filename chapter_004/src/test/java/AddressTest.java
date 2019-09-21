import addresses.Address;
import addresses.Profile;
import addresses.Profiles;
import org.junit.Test;

import java.util.ArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AddressTest {
    @Test
    public void whenGetTwoAddress() {
        Address address1 = new Address("Moscow", "Lenina", 3, 23);
        Address address2 = new Address("Moscow", "Lenina", 5, 25);
        ArrayList<Address> espect = new ArrayList<>();
        espect.add(address1);
        espect.add(address2);

        ArrayList<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(address1));
        profiles.add(new Profile(address2));
        Profiles profiles1 = new Profiles();
        assertThat(profiles1.collect(profiles), is(espect));
    }

    @Test
    public void whenHaveDuplicationAdresses() {
        Address address1 = new Address("Moscow", "Lenina", 5, 25);
        Address address2 = new Address("Moscow", "Lenina", 5, 25);
        Address address3 = new Address("Anapa", "Lenina", 2, 33);
        ArrayList<Address> espect = new ArrayList<>();
        espect.add(address3);
        espect.add(address1);

        ArrayList<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile(address1));
        profiles.add(new Profile(address2));
        profiles.add(new Profile(address3));
        Profiles profiles1 = new Profiles();
        assertThat(profiles1.collect(profiles), is(espect));
    }
}
