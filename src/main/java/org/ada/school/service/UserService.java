package org.ada.school.service;

import java.util.Date;
import java.util.List;
import org.ada.school.dto.UserDto;
import org.ada.school.model.User;

public interface UserService {
  User create(User user);

  User findById(String id);
  List<User> findUsersWithNameOrLastNameLike(String queryText);
  List<User> findUsersCreatedAfter(Date startDate);

  List<User> all();

  boolean deleteById(String id);

  User update(UserDto userDto, String id);
}
