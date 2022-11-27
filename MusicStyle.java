public class MusicStyle {
    public static void main(String[] args) {
        ClassicMusic classicMusic = new ClassicMusic();
        PopMusic popMusic = new PopMusic();
        RockMusic rockMusic = new RockMusic();
        MusicStyle[] musicStyles = new MusicStyle[]{
                classicMusic,
                popMusic,
                rockMusic
        };

        for (MusicStyle i : musicStyles) {
            i.playMusic();
        }
    }

    void playMusic() {
        System.out.println("Playing music");
    }
}