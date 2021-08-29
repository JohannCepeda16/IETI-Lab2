package org.ada.school.repository;

import java.util.List;
import java.util.Date;

import org.ada.school.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findUsersWithNameOrLastNameLike(String queryText);
    List<User> findUsersCreatedAfter(Date startDate);
}
