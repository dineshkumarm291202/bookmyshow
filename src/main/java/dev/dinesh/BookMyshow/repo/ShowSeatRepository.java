package dev.dinesh.BookMyshow.repo;

import dev.dinesh.BookMyshow.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}
