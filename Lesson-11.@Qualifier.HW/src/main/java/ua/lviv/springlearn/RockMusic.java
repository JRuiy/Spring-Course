package ua.lviv.springlearn;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> songs = new ArrayList<>();

    {
        songs.add("First Rock song");
        songs.add("Second Rock song");
        songs.add("3rd Rock song");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
