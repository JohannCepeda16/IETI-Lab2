package org.ada.school.model;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import org.ada.school.dto.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class User implements Serializable {

  @Id
  String id;

  String name;

  @Indexed(unique = true)
  String email;

  String lastName;

  Date createdAt;

  public User() {}

  public User(UserDto userDto) {
    id = UUID.randomUUID().toString();
    name = userDto.getName();
    lastName = userDto.getLastName();
    email = userDto.getEmail();
    createdAt = new Date();
  }

  public void update(UserDto userDto) {
    name = userDto.getName();
    lastName = userDto.getLastName();
    email = userDto.getEmail();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", name='" +
      getName() +
      "'" +
      ", email='" +
      getEmail() +
      "'" +
      ", lastName='" +
      getLastName() +
      "'" +
      ", createdAt='" +
      getCreatedAt() +
      "'" +
      "}"
    );
  }
}
