package pl.lukaszlebiecki.app.domain.exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @GetMapping("/exercise")
    String exerciseEmpty() {
        return "exercise.html";
    }

    @GetMapping("/exercise/{id}")
    String exercise(@PathVariable Long id, Model model) {
        Optional<Exercise> exerciseOptional = exerciseService.findById(id);
        if (exerciseOptional.isPresent()) {
            Exercise exercise = exerciseOptional.get();
            model.addAttribute("exercise_name",exercise.getName());
            model.addAttribute("exercise_description", exercise.getDescription());
            model.addAttribute("target1", exercise.getTarget1());
            model.addAttribute("target2", exercise.getTarget2());
            model.addAttribute("target3", exercise.getTarget3());
            model.addAttribute("gif_file", exercise.getGifFile());
        }
        return "exercise.html";
    }
}
