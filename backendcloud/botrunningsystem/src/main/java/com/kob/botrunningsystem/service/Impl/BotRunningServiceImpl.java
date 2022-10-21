package com.kob.botrunningsystem.service.Impl;

import com.kob.botrunningsystem.service.BotRunningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BotRunningServiceImpl implements BotRunningService{
    @Override
    public String addBot(Integer userId, String botCode, String input) {
        System.out.println("add bot: " + userId + " " + botCode + " " + input);
        return "add bot success";
    }
}
