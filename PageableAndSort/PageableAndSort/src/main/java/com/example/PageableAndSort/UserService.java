package com.example.PageableAndSort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page<User> findAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public List<User> findAllUsersSorted(Sort sort) {
        return userRepository.findAll(sort);
    }

    public Page<User> findUsersByAgeGreaterThan(int age, Pageable pageable) {
        return userRepository.findByAgeGreaterThan(age, pageable);
    }
}

