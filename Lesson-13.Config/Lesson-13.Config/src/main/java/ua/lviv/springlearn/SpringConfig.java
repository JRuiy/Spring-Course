package ua.lviv.springlearn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public HipHopMusic hipHopMusic(){
        return new HipHopMusic();
    }

    @Bean
    public List<Music> allMusic(){
        List<Music> allMusic = new ArrayList<>();
        allMusic.add(classicalMusic());
        allMusic.add(rockMusic());
        allMusic.add(hipHopMusic());
        return allMusic;
    }

    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(allMusic());
    }

    @Bean
    public Computer computer(){
        return new Computer(musicPlayer());
    }


}
