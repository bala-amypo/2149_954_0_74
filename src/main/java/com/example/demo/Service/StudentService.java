package com.example.demo.service;

import java.util.*;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Studentity;

@Service
public class StudserviceImpl implements StudentService {

    private final Map<Long, Studentity> store = new HashMap<>();

    @Override
    public Studentity insertStudentity(Studentity st) {
        store.put(st.getId(), st);
        return st;
    }

    @Override
    public List<Studentity> getAllStudentity() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Studentity> getOneStudent(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void deleteStudent(Long id) {
        store.remove(id);
    }
}