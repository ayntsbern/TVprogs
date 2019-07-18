package com.tvprog.service;

import com.tvprog.domain.Channel;
import com.tvprog.repository.ChannelRepository;
import com.tvprog.repository.ChannelRepositoryImpl;

import java.util.Collections;
import java.util.List;

public class ChannelServiceImpl implements ChannelService {
    private ChannelRepository channelRepository = new ChannelRepositoryImpl();

    public void delete(List<Channel.TVprogramme> tVprogramme, String time){
        if(time!=null&&tVprogramme!=null){
            channelRepository.delete(tVprogramme, time);
        }
    }

    public void update(Channel.TVprogramme tVprogramme, String time, String progTitle){
        if(time!=null&&progTitle!=null){
            channelRepository.update(tVprogramme, time, progTitle);
        }
    }

    public void updateList(List<Channel.TVprogramme> tVprogramme){
        if(tVprogramme!=null) Collections.sort(tVprogramme);
    }

    public List<Channel> getAll(){ return  channelRepository.getAll();
    }

    public Channel getById(Integer id) {
        if(id!=null) return channelRepository.getById(id);

        return null;
    }
}
