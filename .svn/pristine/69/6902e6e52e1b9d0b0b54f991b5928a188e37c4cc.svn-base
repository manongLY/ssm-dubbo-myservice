package cn.mldn.myservice;
import java.io.IOException;
import org.apache.activemq.transport.TransportListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ProviderTransportListener implements TransportListener {
	private static final Logger LOG = LoggerFactory.getLogger(ProviderTransportListener.class) ;
	@Override
	public void onCommand(Object arg0) {	// 进行命令监听，在测试下使用 
		LOG.info("监测到服务命令：{}" + arg0);
	}
	@Override
	public void onException(IOException arg0) {	// 出现异常时的回调
		LOG.debug("出现异常：{}" + arg0);
	}
	@Override
	public void transportInterupted() {	// 传输中断时回调
		LOG.debug("传输中断。");
	}
	@Override
	public void transportResumed() {	// 传输恢复时的回调
		// 第一次连接的时候也同样会进行调用
		LOG.debug("建立连接或传输恢复。");
	}
}
