package com.wuhan.learning.bff.exception;

public class ResourceNotFoundException extends GenericException {

  public ResourceNotFoundException(String code, String message) {
    super(code, message);
  }
}
