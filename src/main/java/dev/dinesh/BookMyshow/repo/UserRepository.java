package dev.dinesh.BookMyshow.repo;

import dev.dinesh.BookMyshow.model.User;
import org.hibernate.query.criteria.JpaSearchedCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
}
