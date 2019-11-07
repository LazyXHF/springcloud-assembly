package cn.xu.zuul.filter;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ~许小桀
 * @date 2019/11/7 20:46
 */
@Component
public class ZuulFilter extends com.netflix.zuul.ZuulFilter {
    //监听类型
    @Override
    public String filterType() {
        return "pre";
    }
    //同一阶段,filter的优先级
    @Override
    public int filterOrder() {
        return 0;
    }
    //是否生效filter
    @Override
    public boolean shouldFilter() {
        return true;
    }
    //执行业务
    @Override
    public Object run() throws ZuulException {
        // 获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String userToken = request.getParameter("userToken");
        if (StringUtils.isEmpty(userToken)) {
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseStatusCode(401);
            currentContext.setResponseBody("userToken is null");
            return null;
        }
        // 否则正常执行业务逻辑.....
        return null;

    }
}
