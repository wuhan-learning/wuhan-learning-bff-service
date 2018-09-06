package com.wuhan.learning.bff.repository;


import com.wuhan.learning.bff.client.GoodsClient;
import com.wuhan.learning.bff.client.OrderClient;
import com.wuhan.learning.bff.client.UserClient;
import com.wuhan.learning.bff.dto.GoodsDTO;
import com.wuhan.learning.bff.dto.OrderDTO;
import com.wuhan.learning.bff.dto.UserDTO;
import com.wuhan.learning.bff.vo.DetailVo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetailRepository {

  @Autowired
  private GoodsClient goodsClient;

  @Autowired
  private UserClient userClient;

  @Autowired
  private OrderClient orderClient;

  public Optional<DetailVo> getDetail(String userId) {
    List<GoodsDTO> goodsDTOList = goodsClient.findAllGood();
    UserDTO userDTO = userClient.getUserById(userId);
    List<OrderDTO> orderDTOList = orderClient.getOrderByUserId(userId);
    DetailVo detailVo = DetailVo.builder().goodsList(goodsDTOList).orderList(orderDTOList)
        .userInfo(userDTO).build();
    return Optional.ofNullable(detailVo);
  }
}
