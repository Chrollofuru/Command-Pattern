public class VolumeUpCommand implements Command {
    private final MusicPlayer musicPlayer;

    public VolumeUpCommand(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.increaseVolume();
    }
}