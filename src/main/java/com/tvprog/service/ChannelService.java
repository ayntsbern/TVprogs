package com.tvprog.service;

import com.tvprog.domain.Channel;

import java.util.List;

public interface ChannelService {
//    void addProg(Channel.TVprogramme order);
//
//    void delete(Channel order);
    void delete(List<Channel.TVprogramme> tVprogramme, String time);

    void update(Channel.TVprogramme tVprogramme, String time, String progTitle);

    List<Channel> getAll();

    void updateList(List<Channel.TVprogramme> tVprogramme);

    Channel getById(Integer id);
}
