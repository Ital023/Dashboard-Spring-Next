package io.github.Ital023.projeto.repositories;

import io.github.Ital023.projeto.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
