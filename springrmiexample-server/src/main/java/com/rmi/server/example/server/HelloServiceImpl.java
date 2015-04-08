package com.rmi.server.example.server;

import com.rmi.server.example.shared.HelloMessage;
import com.rmi.server.example.shared.HelloResponse;
import com.rmi.server.example.shared.HelloService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author Yashprit
 */
public class HelloServiceImpl implements HelloService {

    private Log log = LogFactory.getLog(getClass());

    public HelloResponse sayHello(HelloMessage message) {
        String messageText = message.getText();
        log.debug("sayHello() is called, message text: " + messageText);
        HelloResponse response = new HelloResponse();
        String text = "Hello from server, your message:  " + messageText;
        response.setText(text);
        return response;
    }

}
