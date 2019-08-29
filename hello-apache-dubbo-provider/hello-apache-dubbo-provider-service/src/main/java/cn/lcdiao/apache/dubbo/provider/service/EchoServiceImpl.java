package cn.lcdiao.apache.dubbo.provider.service;

import cn.lcdiao.apache.dubbo.provider.api.EchoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author diao
 * @date 2019/8/29
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService {
    @Override
    public String echo(String string) {
        return "Echo Hello " + string;
    }
}
