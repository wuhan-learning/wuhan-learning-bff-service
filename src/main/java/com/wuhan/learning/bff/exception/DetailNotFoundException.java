package com.wuhan.learning.bff.exception;

public class DetailNotFoundException extends ResourceNotFoundException {

  public DetailNotFoundException() {
    super("DETAIL_NOT_FOUND", "No detail found with given userId");
  }
}
