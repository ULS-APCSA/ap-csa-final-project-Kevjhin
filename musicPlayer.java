import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;

public class musicPlayer {
static ArrayList <String> amusic=new ArrayList<String>();

        public static void playMusic() {
            try {
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\piano.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\whisper.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\legend.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\mild.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\scientific.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\constriction.wav");
                String a=amusic.get((int)(Math.random()*6));
                File file = new File(a);
                if (file.exists()) {
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                } else {
                    System.out.println("?:" + a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static void playMusic(int choice) {
            try {
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\piano.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\whisper.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\legend.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\mild.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\scientific.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\constriction.wav");
                String a=amusic.get((int)(choice%6));
                File file = new File(a);
                if (file.exists()) {
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                } else {
                    System.out.println("?:" + a);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public static void playEnding(){
            try{
                String a="C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\piano.wav";
                File file = new File(a);
                if (file.exists()) {
                    AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioStream);
                    clip.start();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
