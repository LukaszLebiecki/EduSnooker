package pl.lukaszlebiecki.app.domain.exercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String target1;
    private String target2;
    private String target3;
    private String gifFile;

    public Exercise() {
    }

    public Exercise(Long id, String name, String description, String gifFile) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.gifFile = gifFile;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
