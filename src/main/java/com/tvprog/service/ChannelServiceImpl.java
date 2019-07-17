package com.tvprog.service;

import com.tvprog.domain.Channel;
import com.tvprog.repository.ChannelRepository;
import com.tvprog.repository.ChannelRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class ChannelServiceImpl implements ChannelService {
    private ChannelRepository channelRepository = new ChannelRepositoryImpl();

    public List<Channel> getAll(){
        return  channelRepository.getAll();
    }
}
