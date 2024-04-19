import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.ArrayList;

public class musicPlayer {
static ArrayList <String> amusic=new ArrayList<String>();
        

        public static void playMusic() {
            try {
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\852124551-1-208-new.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_370617035_da2-1-192.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_403418950-1-208.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_447059649_nb2-1-16.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_447116833_nb2-1-16.wav");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_816636039-1-208.wav");
                String a=amusic.get((int)(Math.random()*4));
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
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\852124551-1-208-new.m4a");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_370617035_da2-1-192.mp3");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_403418950-1-208.mp3");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_447059649_nb2-1-16.mp3");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_447116833_nb2-1-16.mp3");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_448103635-1-208.mp3");
                amusic.add("C:\\Users\\kevin\\Desktop\\JavaProgram\\Musc\\贝贝_816636039-1-208.mp3");
                String a=amusic.get((int)(choice%7));
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
    }
