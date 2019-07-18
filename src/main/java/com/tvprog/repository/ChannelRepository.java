package com.tvprog.repository;

import java.util.List;
import com.tvprog.domain.Channel;

public interface ChannelRepository {
    //void add(Channel order);

    void delete(List<Channel.TVprogramme> tVprogramme, String time);

    List<Channel> getAll();

    //List<Channel.TVprogramme> getAllProg();

    Channel getById(Integer id);
}
