package pl.lukaszlebiecki.app.domain.user.dto;

public class UserInfoDto {
    private final String name;
    private final String level;
    private final String progress;

    public UserInfoDto(String name, String level, String progress) {
        this.name = name;
        this.level = level;
        this.progress = progress;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public String getProgress() {
        return progress;
    }
}
