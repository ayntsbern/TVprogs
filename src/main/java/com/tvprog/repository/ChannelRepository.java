package com.tvprog.repository;

import java.util.List;
import com.tvprog.domain.Channel;

public interface ChannelRepository {
    //void save(Order order);

    //void delete(Order order);

    List<Channel> getAll();
}
