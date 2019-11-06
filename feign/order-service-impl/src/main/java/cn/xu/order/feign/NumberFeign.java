package cn.xu.order.feign;

import cn.xu.order.service.UserService;
import org.springframework.cloud.openfeign.FeignClient;


/**
 * @author ~许小桀
 * @date 2019/11/7 0:14
 */
@FeignClient("number-service")
public interface NumberFeign extends UserService {

}
