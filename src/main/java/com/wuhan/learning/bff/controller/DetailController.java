package com.wuhan.learning.bff.controller;

import com.wuhan.learning.bff.service.DetailService;
import com.wuhan.learning.bff.vo.DetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bff/detail")
public class DetailController {

  private final DetailService detailService;

  @Autowired
  public DetailController(DetailService detailService) {
    this.detailService = detailService;
  }

  @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
  public DetailVo productDetail(@PathVariable String userId) {
    return detailService.getDetail(userId);
  }
}
