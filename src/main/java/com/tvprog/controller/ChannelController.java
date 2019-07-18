package com.tvprog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tvprog.domain.Channel;
import com.tvprog.service.ChannelService;
import com.tvprog.service.ChannelServiceImpl;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping(value="/programme/{id}", method=RequestMethod.GET)
    public String getProgramme(Model model, @PathVariable("id") Integer id) {
        Channel channels = channelService.getById(id);
        if (channels == null) {
            model.addAttribute("msg", "User not found");
        } else {
            List<Channel.TVprogramme> tVprogrammeList = channels.getProgramme();
            model.addAttribute("programmeList", tVprogrammeList);
            model.addAttribute("id", id);
        }
        return "programme";
    }
    @RequestMapping(value = "/add-new-programme/{id}", method=RequestMethod.GET)
    public String addNewProgrammePage(Model model, @PathVariable("id") Integer id) {
        //Channel.TVprogramme tv = new Channel.TVprogramme();
        //Channel channels = channelService.getById(id);
        //channels.getProgramme()
        model.addAttribute("id", id);
        return "addNewProgramme";
    }

    @RequestMapping(value = "/add/{id}", method=RequestMethod.GET)
    public String addNewProgramme(@RequestParam(value="time") String time,
                                  @RequestParam(value="progTitle") String progTitle,
                                  @PathVariable("id") Integer id) {
        Channel channel = channelService.getById(id);
        channel.setProgramme(time, progTitle);
        return "redirect:/programme/{id}";
    }

    @RequestMapping(value="delete/{id}/{time}", method=RequestMethod.GET)
    public String deleteItem(@PathVariable (value="id") Integer id,
                             @PathVariable(value="time") String time) {
        Channel channel = channelService.getById(id);
        List<Channel.TVprogramme> tVprogrammeList = channel.getProgramme();
        channelService.delete(tVprogrammeList, time);
        //orderService.delete(order);
        return "redirect:/programme/{id}";
    }
}
