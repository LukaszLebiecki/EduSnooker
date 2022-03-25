package pl.lukaszlebiecki.app.domain.exercise;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class ExerciseService {
    private final ExerciseRepository exerciseRepository;

    public ExerciseService(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    public Optional<Exercise> findById(Long id) {
        Optional<Exercise> optionalExercise = exerciseRepository.findById(id);
        return optionalExercise;
    }
}
