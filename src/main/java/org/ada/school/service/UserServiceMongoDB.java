package org.ada.school.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.ada.school.dto.UserDto;
import org.ada.school.model.User;
import org.ada.school.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceMongoDB implements UserService {

  private final UserRepository userRepository;

  public UserServiceMongoDB(@Autowired UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User create(User user) {
    return userRepository.save(user);
  }

  @Override
  public User findById(String id) {
    Optional<User> user = userRepository.findById(id);
    if (user.isPresent()) return user.get();
    return null;
  }

  @Override
  public List<User> findUsersWithNameOrLastNameLike(String queryText) {
    return userRepository.findUsersWithNameOrLastNameLike(queryText);
  }

  @Override
  public List<User> findUsersCreatedAfter(Date startDate) {
    return userRepository.findUsersCreatedAfter(startDate);
  }

  @Override
  public List<User> all() {
    return userRepository.findAll();
  }

  @Override
  public boolean deleteById(String id) {
    userRepository.deleteById(id);
    return !userRepository.findById(id).isPresent();
  }

  @Override
  public User update(UserDto userDto, String id) {
    User user = findById(id);
    if (user != null) {
      user.update(userDto);
      userRepository.save(user);
      return user;
    }
    return null;
  }
}
