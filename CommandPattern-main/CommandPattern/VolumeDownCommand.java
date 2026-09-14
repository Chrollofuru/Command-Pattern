public class VolumeDownCommand implements Command {
    private final MusicPlayer musicPlayer;

    public VolumeDownCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.decreaseVolume();
    }
}