package com.wuhan.learning.bff.service;

import com.wuhan.learning.bff.exception.DetailNotFoundException;
import com.wuhan.learning.bff.repository.DetailRepository;
import com.wuhan.learning.bff.vo.DetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {


  private DetailRepository detailRepository;


  @Autowired
  public DetailService(DetailRepository detailRepository) {
    this.detailRepository = detailRepository;
  }

  public DetailVo getDetail(String userId) {
    return detailRepository.getDetail(userId).orElseThrow(DetailNotFoundException::new);
  }
}
