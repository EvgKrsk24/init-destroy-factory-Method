package ru.spring.springcourse;

/**
 * @author Neil Alishev
 */
public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    public void doMyInitP() {
        System.out.println("Init MusicPlayer");
    }

    public void doMyDestroyP() {
        System.out.println("Destroy MusicPlayer");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {}

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
