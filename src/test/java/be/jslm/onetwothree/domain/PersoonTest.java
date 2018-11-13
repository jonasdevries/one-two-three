package be.jslm.onetwothree.domain;

import org.junit.*;
import org.junit.runner.*;
import org.mockito.junit.*;
import org.slf4j.*;
import java.time.*;

import static org.assertj.core.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
public class PersoonTest {

    private final static Logger LOGGER = LoggerFactory.getLogger(PersoonTest.class);

    @Test
    public void testToString(){
        Persoon p1 = new Persoon();
        p1.setId(1L);
        p1.setNaam("Doe");
        p1.setVoornaam("John");
        p1.setGeboorteDatum(LocalDate.of(1984, 01, 23));

        String actual = p1.toString();
        assertThat(actual).isEqualTo("Persoon[id=1, voornaam=John, naam=Doe, geboorteDatum=1984-01-23]");
    }
}
