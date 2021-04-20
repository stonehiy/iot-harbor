package com.mqtt.test;

import com.iot.container.AuthencationSession;
import org.springframework.stereotype.Component;

@Component
public class MqttAuthencation implements AuthencationSession {
    @Override
    public boolean auth(String username, String password) {
        System.out.println("username = " + username + "||password = " + password);
        return false;
    }
}
