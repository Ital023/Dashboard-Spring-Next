package io.github.Ital023.projeto.service;

import io.github.Ital023.projeto.dto.UserDTO;
import io.github.Ital023.projeto.entities.UserEntity;
import io.github.Ital023.projeto.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<UserDTO> findAll() {
        List<UserEntity> users = repository.findAll();
        return users.stream().map(x -> new UserDTO(x)).toList();
    }

    public void insert(UserDTO dto) {
        UserEntity userEntity = new UserEntity(dto);
        repository.save(userEntity);
    }

    public UserDTO update(UserDTO dto) {
        UserEntity userEntity = new UserEntity(dto);
        return new UserDTO(repository.save(userEntity));
    }

    public void delete(Long id) {
        UserEntity userEntity = repository.getReferenceById(id);
        repository.delete(userEntity);
    }

    public UserDTO searchById(Long id){
        return new UserDTO(repository.findById(id).get());
    }

}
