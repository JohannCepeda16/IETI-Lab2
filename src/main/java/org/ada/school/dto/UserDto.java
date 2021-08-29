package org.ada.school.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

  String name;
  String email;
  String lastName;


  public UserDto() {
  }

  public UserDto(String name, String email, String lastName) {
    this.name = name;
    this.email = email;
    this.lastName = lastName;
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

  public UserDto name(String name) {
    setName(name);
    return this;
  }

  public UserDto email(String email) {
    setEmail(email);
    return this;
  }

  public UserDto lastName(String lastName) {
    setLastName(lastName);
    return this;
  }

  @Override
  public String toString() {
    return "{" +
      " name='" + getName() + "'" +
      ", email='" + getEmail() + "'" +
      ", lastName='" + getLastName() + "'" +
      "}";
  }

}
