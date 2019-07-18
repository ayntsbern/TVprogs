package com.tvprog.repository;

import com.tvprog.domain.Channel;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ChannelRepositoryImplTest {
    private ChannelRepository channelRepository = new ChannelRepositoryImpl();

    @Test
    public void update() {
        Channel channel1 = new Channel(1, "Первый");
        channel1.setProgramme(0,"15:00", "Время с субтитрами");
        channel1.setProgramme(1,"12:15", "Время покажет");
        channel1.setProgramme(2,"10:55", "Жить здорово");

        List<Channel.TVprogramme> tVprogrammeList = channel1.getProgramme();

        for(Channel.TVprogramme programme : tVprogrammeList)
            if (programme.getId().compareTo(0) == 0){
                programme.setTime("19:00");
                programme.setProgtitle("Новости");
            }

        Channel channel2 = new Channel(1, "Первый");
        channel2.setProgramme(0,"15:00", "Время с субтитрами");
        channel2.setProgramme(1,"12:15", "Время покажет");
        channel2.setProgramme(2,"10:55", "Жить здорово");
        List<Channel.TVprogramme> tVprogrammeList2 = channel2.getProgramme();

        for(Channel.TVprogramme programme : tVprogrammeList2)
            if(programme.getId().compareTo(0)==0)
                channelRepository.update(programme, "19:00", "Новости");

        Assert.assertEquals("Неверное время",channel1.getProgramme().get(0).getTime(),
                channel2.getProgramme().get(0).getTime());
        Assert.assertEquals("Неверное название",channel1.getProgramme().get(0).getProgtitle(),
                channel2.getProgramme().get(0).getProgtitle());

        for(Channel.TVprogramme programme : tVprogrammeList)
            if (programme.getId().compareTo(1) == 0){
                programme.setTime("12:15");
                programme.setProgtitle("С Тиной Канделаки");
            }

        for(Channel.TVprogramme programme : tVprogrammeList2)
            if(programme.getId().compareTo(1)==0)
                channelRepository.update(programme, "12:15", "С Тиной Канделаки");

        Assert.assertEquals("Неверное название",channel1.getProgramme().get(0).getProgtitle(),
                channel2.getProgramme().get(0).getProgtitle());


        for(Channel.TVprogramme programme : tVprogrammeList)
            if (programme.getId().compareTo(2) == 0){
                programme.setTime("1:15");
                programme.setProgtitle("Жить здорово");
            }

        for(Channel.TVprogramme programme : tVprogrammeList2)
            if(programme.getId().compareTo(2)==0)
                channelRepository.update(programme, "1:15", "Жить здорово");

        Assert.assertEquals("Неверное время",channel1.getProgramme().get(0).getTime(),
                channel2.getProgramme().get(0).getTime());
    }

    @Test
    public void delete() {
        Channel channel1 = new Channel(1, "Первый");
        channel1.setProgramme(0,"15:00", "Время с субтитрами");
        channel1.setProgramme(1,"12:15", "Время покажет");
        channel1.setProgramme(2,"10:55", "Жить здорово");

        Channel channel2 = new Channel(1, "Первый");

        channel2.setProgramme(0,"15:00", "Время с субтитрами");
        channel2.setProgramme(1,"12:15", "Время покажет");
        channel2.setProgramme(2,"10:55", "Жить здорово");
        List<Channel.TVprogramme> tVprogrammeList2 = channel2.getProgramme();
        channelRepository.delete(tVprogrammeList2,"12:15");

        //Assert.assertNotEquals("Элемент не удален",channel1.getProgramme().get(1),channel2.getProgramme().get(1));
    }

    @Test
    public void getAll() {
        Channel channel1 = new Channel(1, "Первый");
        Channel channel2 = new Channel(2, "Россия 1");
        Channel channel3 = new Channel(3, "Матч!");
        List<Channel> channels = new ArrayList<>();
        channels.add(channel1);
        channels.add(channel2);
        channels.add(channel3);

        List<Channel> o = channelRepository.getAll();
        for (int i = 0; i < channels.size(); i++)
            Assert.assertEquals("Элементы с ID = " + i +" не совпадаеют",
                    channels.get(i).getId(),o.get(i).getId());
    }

    @Test
    public void getById() {
        Channel channel1 = new Channel(1, "Первый");
        Channel channel2 = new Channel(2, "Россия 1");
        Channel channel3 = new Channel(3, "Матч!");
        List<Channel> channels = new ArrayList<>();
        channels.add(channel1);
        channels.add(channel2);
        channels.add(channel3);
        Channel ch = channels.get(2);

        channelRepository.getById(2);

        Assert.assertEquals("ID не равны",ch.getId(),channelRepository.getById(2).getId());
        Assert.assertEquals("Названия не равны",ch.getTitle(),channelRepository.getById(2).getTitle());
    }
}