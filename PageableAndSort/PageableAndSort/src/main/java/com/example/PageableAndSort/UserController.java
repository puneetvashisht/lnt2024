package com.example.PageableAndSort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Get all users with pagination
    @GetMapping("/all")
    public Page<User> getAllUsers(@RequestParam(defaultValue = "0") int page,
                                  @RequestParam(defaultValue = "10") int size,
                                  @RequestParam(defaultValue = "id") String sortBy,
                                  @RequestParam(defaultValue = "asc") String sortDir) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDir), sortBy);
        PageRequest pageable = PageRequest.of(page, size, sort);
        return userService.findAllUsers(pageable);
    }

    // Get all users with sorting
    @GetMapping("/sorted")
    public List<User> getAllUsersSorted(@RequestParam(defaultValue = "id", value = "sortBy") String sortBy,
                                        @RequestParam(defaultValue = "asc") String sortDir) {
       
                                            // create a sort object
        Sort sort = Sort.by(Sort.Direction.fromString(sortDir), sortBy);
        return userService.findAllUsersSorted(sort);
    }

    // Get users by age greater than with pagination and sorting
    @GetMapping("/age-greater-than")
    public Page<User> getUsersByAgeGreaterThan(@RequestParam int age,
                                               @RequestParam(defaultValue = "0") int page,
                                               @RequestParam(defaultValue = "10") int size,
                                               @RequestParam(defaultValue = "id") String sortBy,
                                               @RequestParam(defaultValue = "asc") String sortDir) {
        Sort sort = Sort.by(Sort.Direction.fromString(sortDir), sortBy);
        PageRequest pageable = PageRequest.of(page, size, sort);
        return userService.findUsersByAgeGreaterThan(age, pageable);
    }
}

