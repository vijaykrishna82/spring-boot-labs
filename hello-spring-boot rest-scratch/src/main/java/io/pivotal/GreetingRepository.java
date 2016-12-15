package io.pivotal;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vijaypivotal on 12/15/16.
 */
public interface GreetingRepository extends JpaRepository<Greeting, Integer> {
}
