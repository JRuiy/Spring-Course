package ua.lviv.springlearn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{

    private List<String> songs = new ArrayList<>();

    {
        songs.add("First Classic song");
        songs.add("Second Classic song");
        songs.add("3rd Classic song");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }

}
