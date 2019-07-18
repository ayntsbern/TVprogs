package com.tvprog.service;

import com.tvprog.domain.Channel;
import com.tvprog.repository.ChannelRepository;
import com.tvprog.repository.ChannelRepositoryImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ChannelServiceImplTest {

    private ChannelService channelRepository = new ChannelServiceImpl();
    @Test
    public void delete() {
    }

    @Test
    public void update() {
    }

    @Test
    public void updateList() {
    }
    @Test
    public void getAll() {
    }

    @Test
    public void getById() {
        Integer id = null;
        Assert.assertNull("Значение было не null",channelRepository.getById(id));
    }
}