package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {

    @Test
    void dependentAssertions() {

        Owner owner = new Owner(1l, "Joe", "Buck");
        owner.setCity("London");
        owner.setTelephone("555555555");

        assertAll("Propoerties Test",
                () -> assertAll("Person Properties",
                            () -> assertEquals("Joe", owner.getFirstName()),
                            () -> assertEquals("Buck", owner.getLastName())),

                () -> assertAll("Owner Properties",
                        () -> assertEquals("London", owner.getCity()),
                        () -> assertEquals("555555555", owner.getTelephone())
                            ));
    }




}