package be.jslm.onetwothree.repository;

import be.jslm.onetwothree.domain.*;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.test.context.junit4.*;

@RunWith(SpringRunner.class)
public class PersoonRepositoryTest {

    @Autowired
    private PersoonRepository persoonRepository;

    @Test
    public void applicationContextsLoads(){

    }

    @Test
    public void testPersoonRepository(){
        persoonRepository.findAll();
    }


}
