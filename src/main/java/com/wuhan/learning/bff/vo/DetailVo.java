package com.wuhan.learning.bff.vo;

import com.wuhan.learning.bff.dto.GoodsDTO;
import com.wuhan.learning.bff.dto.OrderDTO;
import com.wuhan.learning.bff.dto.UserDTO;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DetailVo {

  UserDTO userInfo;
  List<OrderDTO> orderList;
  List<GoodsDTO> goodsList;
}
