package pl.lukaszlebiecki.app.domain.exercise.dto;

public class ExerciseDto {

    private String name;
    private String description;
    private String target1;
    private String target2;
    private String target3;
    private String gifFile;

    public ExerciseDto(String name, String description, String target1, String target2, String target3, String gifFile) {
        this.name = name;
        this.description = description;
        this.target1 = target1;
        this.target2 = target2;
        this.target3 = target3;
        this.gifFile = gifFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTarget1() {
        return target1;
    }

    public void setTarget1(String target1) {
        this.target1 = target1;
    }

    public String getTarget2() {
        return target2;
    }

    public void setTarget2(String target2) {
        this.target2 = target2;
    }

    public String getTarget3() {
        return target3;
    }

    public void setTarget3(String target3) {
        this.target3 = target3;
    }

    public String getGifFile() {
        return gifFile;
    }

    public void setGifFile(String gifFile) {
        this.gifFile = gifFile;
    }
}
