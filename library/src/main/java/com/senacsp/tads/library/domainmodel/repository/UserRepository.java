package com.senacsp.tads.library.domainmodel.repository;

import com.senacsp.tads.library.domainmodel.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface UserRepository implements UserRepository<User, UUID> {

    private final List<User> internalData = new ArrayList<>();

    public NonPersistentUserRepository() {
        Faker faker = new Faker();
    }
}
