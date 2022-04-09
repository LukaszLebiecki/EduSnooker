package pl.lukaszlebiecki.app.domain.training;

import pl.lukaszlebiecki.app.domain.training.dto.TrainingDto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class TrainingDtoMapper {

    static TrainingDto map(Training training) {
        String email = training.getEmail();
        LocalDate date = training.getDate();
        String exerciseNumber = training.getExerciseNumber();
        LocalTime startTime = training.getStartTime();
        LocalTime endTime = training.getEndTime();
        int pointsScored = training.getPointsScored();
        return new TrainingDto(email, exerciseNumber, date, startTime, endTime, pointsScored);
    }
}
