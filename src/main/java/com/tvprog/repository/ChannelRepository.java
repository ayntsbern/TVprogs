package com.tvprog.repository;

import java.util.List;
import com.tvprog.domain.Channel;

public interface ChannelRepository {

    void delete(List<Channel.TVprogramme> tVprogramme, String time);

    void update(Channel.TVprogramme tVprogramme, String time, String progTitle);

    List<Channel> getAll();

    //List<Channel.TVprogramme> getAllProg();

    Channel getById(Integer id);
}
