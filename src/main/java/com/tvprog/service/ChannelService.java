package com.tvprog.service;

import com.tvprog.domain.Channel;

import java.util.List;

public interface ChannelService {
//    void addProg(Channel.TVprogramme order);
//
//    void delete(Channel order);
    void delete(List<Channel.TVprogramme> tVprogramme, String time);

    List<Channel> getAll();

    Channel getById(Integer id);
}
