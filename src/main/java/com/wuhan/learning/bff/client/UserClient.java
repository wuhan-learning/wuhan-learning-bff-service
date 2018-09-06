package com.wuhan.learning.bff.client;

import com.wuhan.learning.bff.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("mst-user-service")
public interface UserClient {

  @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
  UserDTO getUserById(@PathVariable("id") String id);

}
