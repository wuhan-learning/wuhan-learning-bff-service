package com.wuhan.learning.bff.repository;


import static com.google.common.collect.Lists.newArrayList;

import com.wuhan.learning.bff.client.GoodsClient;
import com.wuhan.learning.bff.client.OrderClient;
import com.wuhan.learning.bff.client.UserClient;
import com.wuhan.learning.bff.dto.GoodsDTO;
import com.wuhan.learning.bff.dto.OrderDTO;
import com.wuhan.learning.bff.dto.UserDTO;
import com.wuhan.learning.bff.vo.DetailVo;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Slf4j
public class DetailRepository {

  @Autowired
  private GoodsClient goodsClient;

  @Autowired
  private UserClient userClient;

  @Autowired
  private OrderClient orderClient;

  public Optional<DetailVo> getDetail(String userId) {
    DetailVo detailVo = DetailVo.builder()
        .goodsList(getAllGoods())
        .orderList(getOrderByUserId(userId))
        .userInfo(getUserById(userId)).build();
    return Optional.ofNullable(detailVo);
  }

  private List<GoodsDTO> getAllGoods() {
    List<GoodsDTO> goodsDTOList = newArrayList();
    try {
      goodsDTOList = goodsClient.findAllGood();
    } catch (Exception e) {
      log.info("getAllGoods:" + e.getMessage());
    }
    return goodsDTOList;
  }

  private List<OrderDTO> getOrderByUserId(String userId) {
    List<OrderDTO> orderDTOList = newArrayList();
    try {
      orderDTOList = orderClient.getOrderByUserId(userId);
    } catch (Exception e) {
      log.info("getAllGoods:" + e.getMessage());
    }
    return orderDTOList;
  }

  private UserDTO getUserById(String userId) {
    UserDTO userDTO = new UserDTO();
    try {
      userDTO = userClient.getUserById(userId);
    } catch (Exception e) {
      log.info("getAllGoods:" + e.getMessage());
    }
    return userDTO;
  }
}
