package ua.lviv.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> allMusic;


    public MusicPlayer(List<Music> allMusic) {
        this.allMusic = allMusic;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String song = allMusic.get(randomNumber).getSong();

        return "Playing: " + song;
    }

}