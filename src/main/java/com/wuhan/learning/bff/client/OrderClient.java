package com.wuhan.learning.bff.client;

import com.wuhan.learning.bff.dto.OrderDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("mst-order-service")
public interface OrderClient {

  @RequestMapping(value = "/order", method = RequestMethod.GET)
  List<OrderDTO> getOrderByUserId(@RequestParam("id") String userId);
}
