package io.github.Ital023.projeto.dto;

import io.github.Ital023.projeto.entities.UserEntity;
import org.springframework.beans.BeanUtils;

public class UserDTO {

    private Long id;
    private String name;
    private String login;
    private String password;
    private String email;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String login, String password, String email) {
        this.id = id;
        this.name = name;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public UserDTO(UserEntity user) {
        BeanUtils.copyProperties(user, this);
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
