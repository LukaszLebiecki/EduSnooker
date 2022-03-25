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
    private AdvancementLevels advancementLevels;
    private int attempts;
    private int maxPointPerAttempt;
    private int numberOfPointToPass;
    private boolean isRed;
    private boolean isYellow;
    private boolean isGreen;
    private boolean isBrown;
    private boolean isBlue;
    private boolean isPink;
    private boolean isBlack;
    private boolean isExtraPoint;


    public Exercise() {
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

    public String getTarget1() {
        return target1;
    }

    public String getTarget2() {
        return target2;
    }

    public String getTarget3() {
        return target3;
    }

    public String getGifFile() {
        return gifFile;
    }

    public AdvancementLevels getAdvancementLevels() {
        return advancementLevels;
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMaxPointPerAttempt() {
        return maxPointPerAttempt;
    }

    public int getNumberOfPointToPass() {
        return numberOfPointToPass;
    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isYellow() {
        return isYellow;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public boolean isBrown() {
        return isBrown;
    }

    public boolean isBlue() {
        return isBlue;
    }

    public boolean isPink() {
        return isPink;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public boolean isExtraPoint() {
        return isExtraPoint;
    }
}
