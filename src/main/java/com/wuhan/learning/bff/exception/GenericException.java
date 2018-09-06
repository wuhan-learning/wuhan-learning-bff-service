package com.wuhan.learning.bff.exception;

public class GenericException extends RuntimeException {

  private String code;

  private String message;

  public GenericException(String code, String message) {
    super(message);
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
