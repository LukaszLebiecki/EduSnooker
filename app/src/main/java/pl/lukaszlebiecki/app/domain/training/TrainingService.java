package pl.lukaszlebiecki.app.domain.training;

import org.springframework.stereotype.Service;
import pl.lukaszlebiecki.app.domain.training.dto.TrainingDto;

import java.util.List;
import java.util.stream.Stream;

@Service
public class TrainingService {

    private final TrainingRepository trainingRepository;

    TrainingService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    public List<TrainingDto> findFourLastTrainingByUserName(String email) {
        List<Training> allByEmail = trainingRepository.findAllByEmail(email);
        Stream<TrainingDto> trainingDtoStream = allByEmail.stream().map(TrainingDtoMapper::map);
        return trainingDtoStream.toList();
    }
}
