package com.example.demo.SwaggerOpenApi.control;

import com.example.demo.SwaggerOpenApi.model.User;
import com.example.demo.SwaggerOpenApi.repo.Userrepo;
import com.hub.authmgmt.api.DefaultApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Usercontrol implements DefaultApi {

    @Autowired
    Userrepo repo;

    @Override
    public ResponseEntity<Void> registerPost(User user) {
        repo.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<User> userUserIdGet(@PathVariable String userId) {
        User user = repo.findById(userId).orElse(null);
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }


}
