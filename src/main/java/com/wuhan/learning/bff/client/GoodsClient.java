package com.wuhan.learning.bff.client;

import com.wuhan.learning.bff.dto.GoodsDTO;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("mst-goods-service")
public interface GoodsClient {

  @RequestMapping(value = "/goods", method = RequestMethod.GET)
  List<GoodsDTO> findAllGood();
}
