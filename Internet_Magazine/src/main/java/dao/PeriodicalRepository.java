package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import domain.Periodical;

public interface PeriodicalRepository extends JpaRepository<Periodical, Integer> {

}
