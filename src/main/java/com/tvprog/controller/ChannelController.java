package com.tvprog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tvprog.domain.Channel;
import com.tvprog.service.ChannelService;
import com.tvprog.service.ChannelServiceImpl;

import java.util.List;

@Controller
public class ChannelController {
    private ChannelService channelService = new ChannelServiceImpl();

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String getOrderPage(Model model) {
        List<Channel> channels = channelService.getAll();
        model.addAttribute("channelList", channels);
        return "channel";
    }
    @RequestMapping(value = "/programme", method=RequestMethod.GET)
    public String getProgramme() {
        return "programme";
    }
}
