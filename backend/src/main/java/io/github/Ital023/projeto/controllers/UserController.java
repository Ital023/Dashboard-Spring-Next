package io.github.Ital023.projeto.controllers;

import io.github.Ital023.projeto.dto.UserDTO;
import io.github.Ital023.projeto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> users = service.findAll();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping
    public void insert(@RequestBody UserDTO dto) {
        service.insert(dto);
    }

    @PutMapping
    public UserDTO update(@RequestBody UserDTO dto) {
        return service.update(dto);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }




}
