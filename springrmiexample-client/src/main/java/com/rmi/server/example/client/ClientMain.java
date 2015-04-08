package com.rmi.server.example.client;

import com.rmi.server.example.shared.HelloResponse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.rmi.server.example.shared.HelloService;
import com.rmi.server.example.shared.HelloMessage;

/**
 * @author Yashprit
 */
public class ClientMain {

    private Log log = LogFactory.getLog(getClass());

    public static void main(String[] args) {
        ClientMain client = new ClientMain();
        client.run();
    }

    public void run() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/com/rmi/server/example/client/applicationContext.xml");
        HelloService service = (HelloService) ctx.getBean("helloService");
        HelloMessage message = new HelloMessage();
        message.setText("hello from client");
        HelloResponse response = service.sayHello(message);
        log.debug("response from server:");
        log.debug(response.getText());
    }
}
