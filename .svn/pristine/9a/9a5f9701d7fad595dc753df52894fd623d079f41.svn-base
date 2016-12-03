package cn.mldn.fcade;
import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import cn.mldn.api.IMessage;
@Component("MsgAPI")	// 与provider.xml文件中定义的名称一致
public class MessageImpl implements IMessage {
	@Resource
	private JmsTemplate jmsTemplate ;
	@Resource 
	private Destination queueDestination ;
	@Override 
	public String echo(String msg) {
		this.jmsTemplate.send(this.queueDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("www.mldnjava.cn");	// 要发送的消息
			}
		});
		return "ECHO HXF  =====> " + msg;
	}
}
