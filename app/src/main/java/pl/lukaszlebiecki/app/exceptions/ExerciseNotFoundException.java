package pl.lukaszlebiecki.app.exceptions;

public class ExerciseNotFoundException extends RuntimeException{

    public ExerciseNotFoundException(String message) {
        super(message);
    }
}
