package cn.zhangbh.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: zhangbh
 * @Date: 2019/11/8 10:43
 * @Description:
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myrole() {
        return new RandomRule();//Ribbon默认是轮询，我定义为随机
    }
}
