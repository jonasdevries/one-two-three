package be.jslm.onetwothree.domain;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface PersoonRepository extends JpaRepository<Persoon, Long> {

    List<Persoon> findByNaam(String naam);

}
