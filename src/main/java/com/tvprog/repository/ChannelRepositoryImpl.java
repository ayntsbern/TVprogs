package com.tvprog.repository;

import java.util.ArrayList;
import java.util.List;

import com.tvprog.domain.Channel;

public class ChannelRepositoryImpl implements ChannelRepository {
    private List<Channel> channels = new ArrayList<>();

    public ChannelRepositoryImpl(){
        Channel channel1 = new Channel(1, "Первый");
        Channel channel2 = new Channel(2, "Россия 1");
        Channel channel3 = new Channel(3, "Матч!");
        Channel channel4 = new Channel(4, "НТВ");
        Channel channel5 = new Channel(5, "Пятый канал");
        Channel channel6 = new Channel(6, "Культура");

        channel1.setProgramme(0,"15:00", "Время с субтитрами");
        channel1.setProgramme(1,"12:15", "Время покажет");
        channel1.setProgramme(2,"10:55", "Жить здорово");
        channels.add(channel1);
        channel2.setProgramme(0,"14:45", "Кто против?"); //Познавательное
        channel2.setProgramme(1,"12:50","60 минут");
        channel2.setProgramme(2,"8:00","Разговорчики");
        channels.add(channel2);
        channel3.setProgramme(0,"14:30", "Водное поло. Чемпионат мира по водным видам спорта. Женщины. " +
                "Прямая трансляция из Кореи. " +
                "Россия - Венгрия");
        channels.add(channel3);
        channel4.setProgramme(0,"14:00", "Ментовские войны 6");
        channel4.setProgramme(1,"19:00", "Сегодня");
        channels.add(channel4);
        channel5.setProgramme(0,"13:25","Береговая охрана. Боевое крещение, 1-я серия");
        channel5.setProgramme(1,"13:00","Известия");
        channel5.setProgramme(2,"12:00","Гаишники-2. 10-я серия");
        channel5.setProgramme(3,"05:25","Страх в твоем доме. Возврату не подлежит");
        channel5.setProgramme(4,"19:00","След. Сорок свечей");
        channels.add(channel5);
        channel6.setProgramme(0,"14:05","Была ли виновна Мария-Антуанетта?");
        channels.add(channel6);
    }

    public void update(Channel.TVprogramme tVprogramme, String time, String progTitle){
        if (tVprogramme.getTime().compareTo(time) != 0) {
            tVprogramme.setTime(time);
        }
        if (tVprogramme.getProgtitle().compareTo(progTitle) != 0) {
            tVprogramme.setProgtitle(progTitle);
        }
        if(tVprogramme.getTime().compareTo(time)!=0 && tVprogramme.getProgtitle().compareTo(progTitle)!=0){
            tVprogramme.setTime(time);
            tVprogramme.setProgtitle(progTitle);
        }
    }

    public void delete(List<Channel.TVprogramme> tVprogramme, String time){
        Channel.TVprogramme o = new Channel.TVprogramme();
        o.setTime(time);
        for(Channel.TVprogramme programme : tVprogramme) {
            if (programme.compareTo(o)==0) tVprogramme.remove(programme);
        }
    }

    public List<Channel> getAll(){
        return  channels;
    }

    public Channel getById(Integer id) {
        return channels.get(id);
    }
}
