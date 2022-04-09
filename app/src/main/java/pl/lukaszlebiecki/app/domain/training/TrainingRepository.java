package pl.lukaszlebiecki.app.domain.training;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

interface TrainingRepository extends CrudRepository<Training, Long> {
    List<Training> findAllByEmail(String email);
}
