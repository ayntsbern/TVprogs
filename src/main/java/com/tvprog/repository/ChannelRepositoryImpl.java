package com.tvprog.repository;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.tvprog.domain.Channel;
//import com.tvprog.domain.Channel.TVprogramme;

public class ChannelRepositoryImpl implements ChannelRepository {
    private List<Channel> channels = new ArrayList<>();
    private List<Channel.TVprogramme> progList = new LinkedList<>();

    public ChannelRepositoryImpl(){
        Channel channel1 = new Channel();
        Channel channel2 = new Channel();
        channel1.setId(1);
        channel2.setId(2);
        channel1.setTitle("STS");
        channel2.setTitle("TNT");
        channels.add(channel1);
        channels.add(channel2);
    }
    public List<Channel> getAll(){
        return  channels;
    }
}
