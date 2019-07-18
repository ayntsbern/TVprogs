package com.tvprog.service;

import com.tvprog.domain.Channel;
import com.tvprog.repository.ChannelRepository;
import com.tvprog.repository.ChannelRepositoryImpl;

import java.util.List;

public class ChannelServiceImpl implements ChannelService {
    private ChannelRepository channelRepository = new ChannelRepositoryImpl();

//    public void addProg(Channel.TVprogramme tVprogramme) {
//        if(tVprogramme!=null) {
//            List<Channel.TVprogramme> tvprogrammes = channelRepository.getAll();
//            if(!channels.isEmpty()) {
//                Channel lastChannel = channels.get(channels.size() - 1);
//                channel.setId(lastChannel.getId()+1);
//                channelRepository.add(channel);
//            }
//        }
//    }

//    public void delete(Channel channel) {
//        if(channel!=null) {
//            channelRepository.delete(channel);
//        }
//    }

//    public  List<Channel.TVprogramme> getAllProg (){
//        channelRepository.
//    }
    public void delete(List<Channel.TVprogramme> tVprogramme, String time){
        if(time!=null&&tVprogramme!=null){
            channelRepository.delete(tVprogramme, time);
        }
    }
    public List<Channel> getAll(){
        return  channelRepository.getAll();
    }

    public Channel getById(Integer id) {
        if(id!=null) return channelRepository.getById(id);

        return null;
    }
}
