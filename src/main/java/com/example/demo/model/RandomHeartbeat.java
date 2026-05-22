package com.example.demo.model;

import com.example.demo.service.HeartbeatSensor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomHeartbeat implements HeartbeatSensor {

    private final Random random = new Random();

    @Override
    public int get() {
        return random.nextInt(191) + 40;
    }

}
