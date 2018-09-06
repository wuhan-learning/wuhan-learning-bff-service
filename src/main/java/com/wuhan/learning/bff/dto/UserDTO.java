package com.wuhan.learning.bff.dto;

import java.util.Objects;

public class UserDTO {

  private String id;
  private String name;
  private String role;

  public static UserDTO buildDefaultUserWithId(String id) {
    UserDTO userDTO = new UserDTO();
    userDTO.setId(id);
    userDTO.setName("Tom");
    userDTO.setRole("Developer");
    return userDTO;
  }

  public UserDTO() {
  }

  public String getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getRole() {
    return this.role;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public boolean equals(Object o) {
    if (o == this) {
      return true;
    } else if (!(o instanceof UserDTO)) {
      return false;
    } else {
      UserDTO other = (UserDTO) o;
      if (!other.canEqual(this)) {
        return false;
      } else {
        label47:
        {
          Object this$id = this.getId();
          Object other$id = other.getId();
          if (this$id == null) {
            if (other$id == null) {
              break label47;
            }
          } else if (this$id.equals(other$id)) {
            break label47;
          }

          return false;
        }

        Object this$name = this.getName();
        Object other$name = other.getName();
        if (this$name == null) {
          if (other$name != null) {
            return false;
          }
        } else if (!this$name.equals(other$name)) {
          return false;
        }

        Object this$role = this.getRole();
        Object other$role = other.getRole();
        if (this$role == null) {
          if (other$role != null) {
            return false;
          }
        } else if (!this$role.equals(other$role)) {
          return false;
        }

        return true;
      }
    }
  }

  protected boolean canEqual(Object other) {
    return other instanceof UserDTO;
  }

  @Override
  public int hashCode() {

    return Objects.hash(id, name, role);
  }

  public String toString() {
    return "UserDTO(id=" + this.getId() + ", name=" + this.getName() + ", role=" + this.getRole()
        + ")";
  }
}
