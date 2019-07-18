package com.tvprog.domain;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ChannelTest {

    @Test
    public void getId() {
        Channel channel = new Channel(1, "STS");
        Assert.assertEquals("Неверно установлен id",Integer.valueOf(1), channel.getId());
    }

    @Test
    public void getTitle() {
        Channel channel = new Channel(2, "TNT");
        Assert.assertEquals("Неверно установлено название","TNT",channel.getTitle());
    }

    @Test
    public void setId() {
        Channel channel = new Channel(1, "МузТВ");
        channel.setId(0);
        Assert.assertEquals("Неверно задан id", Integer.valueOf(0), channel.getId());
    }

    @Test
    public void setTitle() {
        Channel channel = new Channel(1, "МузТВ");
        channel.setTitle("РенТВ");
        Assert.assertEquals("Неверно задано название", "РенТВ", channel.getTitle());
    }

    @Test
    public void setProgramme() {
        Channel exChannel = new Channel(1, "МузТВ");
        List<Channel.TVprogramme> exProg = exChannel.getProgramme();
        Channel.TVprogramme programme = new Channel.TVprogramme();
        programme.setId(0);
        programme.setTime("11:20");
        programme.setProgtitle("Женева");
        exProg.add(programme);

        Channel channel = new Channel(1, "МузТВ");
        channel.setProgramme(0,"11:20","Женева");

        Assert.assertEquals("ID объектов не равны",exChannel.getProgramme().get(0).getId(),
                channel.getProgramme().get(0).getId());
        Assert.assertEquals("Time объектов не равно",exChannel.getProgramme().get(0).getTime(),
                channel.getProgramme().get(0).getTime());
        Assert.assertEquals("Progtitle объектов не равно",exChannel.getProgramme().get(0).getProgtitle(),
                channel.getProgramme().get(0).getProgtitle());
    }

    @Test
    public void setProgramme1() {
        Channel exChannel = new Channel(1, "МузТВ");
        List<Channel.TVprogramme> exProg = exChannel.getProgramme();
        Channel.TVprogramme programme = new Channel.TVprogramme();
        programme.setId(0);
        programme.setTime("11:20");
        programme.setProgtitle("Женева");
        exProg.add(programme);

        Channel channel = new Channel(1, "МузТВ");
        channel.setProgramme("11:20","Женева");

        Assert.assertEquals("ID объектов не равны",exChannel.getProgramme().get(0).getId(),
                channel.getProgramme().get(0).getId());
        Assert.assertEquals("Time объектов не равно",exChannel.getProgramme().get(0).getTime(),
                channel.getProgramme().get(0).getTime());
        Assert.assertEquals("Progtitle объектов не равно",exChannel.getProgramme().get(0).getProgtitle(),
                channel.getProgramme().get(0).getProgtitle());

    }

    @Test
    public void getProgramme() {
        Channel exChannel = new Channel(1, "МузТВ");
        List<Channel.TVprogramme> exProg = exChannel.getProgramme();
        Channel.TVprogramme programme = new Channel.TVprogramme();
        programme.setId(0);
        programme.setTime("11:20");
        programme.setProgtitle("Женева");
        exProg.add(programme);

        Channel channel = new Channel(1, "МузТВ");
        channel.setProgramme("11:20","Женева");

        Assert.assertEquals("Объекты не равны",exChannel.getProgramme().get(0).toString(),
                channel.getProgramme().get(0).toString());
    }
}