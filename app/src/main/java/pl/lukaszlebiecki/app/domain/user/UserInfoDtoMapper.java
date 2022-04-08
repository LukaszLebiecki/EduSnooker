package pl.lukaszlebiecki.app.domain.user;

import pl.lukaszlebiecki.app.domain.user.dto.UserInfoDto;

class UserInfoDtoMapper {

    static UserInfoDto map(User user) {
        String name = user.getName();
        String level = user.getUserLevel().getLevel();
        String progress = user.getUserLevel().getProgress();
        return new UserInfoDto(name, level, progress);
    }
}
