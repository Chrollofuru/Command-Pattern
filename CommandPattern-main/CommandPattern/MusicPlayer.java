public class MusicPlayer {
    private int volume;
    private String playlist;

    public MusicPlayer(String defaultPlaylist) {
        this.volume = 50;
        this.playlist = defaultPlaylist;
    }

    public void turnOn() {
        System.out.println("[MusicPlayer] ON, playing playlist: \"" + playlist + "\"");
    }

    public void turnOff() {
        System.out.println("[MusicPlayer] OFF");
    }

    public void increaseVolume() {
        volume = Math.min(100, volume + 10);
        System.out.println("[MusicPlayer] volume up -> " + volume);
    }

    public void decreaseVolume() {
        volume = Math.max(0, volume - 10);
        System.out.println("[MusicPlayer] volume down -> " + volume);
    }
}