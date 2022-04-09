package pl.lukaszlebiecki.app.domain.training.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TrainingDto {

    private String email;
    private String exerciseNumber;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private int pointsScored;

    public TrainingDto(String email, String exerciseNumber, LocalDate date, LocalTime startTime, LocalTime endTime, int pointsScored) {
        this.email = email;
        this.exerciseNumber = exerciseNumber;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pointsScored = pointsScored;
    }

    public String getEmail() {
        return email;
    }

    public String getExerciseNumber() {
        return exerciseNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public int getPointsScored() {
        return pointsScored;
    }
}
