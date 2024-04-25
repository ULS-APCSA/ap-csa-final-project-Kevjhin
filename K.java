import java.util.Scanner;
public class K {
    public static void main(String[] args) {
        Scanner az=new Scanner(System.in);
        System.out.println("Music List");
        System.out.println("1.piano");
        System.out.println("2.whisper");
        System.out.println("3.legend");
        System.out.println("4.mild");
        System.out.println("5.scientific");
        System.out.println("6.constriction");
        System.out.println("Type a number to chose music( recommand 1 & 2 AUA )");
        System.out.println("pick 6 if you like horror (not really scary)");
        System.out.println("Type 0 to pick a random music");
        int a=az.nextInt();
        if(a==0){
            musicPlayer.playMusic();
        }else{
            musicPlayer.playMusic(a-1);
        }
        //play music
        
       
        System.out.println("Skip intro & rules?(type 1 to skip)");
        try{
            int choice=az.nextInt();
        if(choice !=1){
            System.out.println(FileReader.getStringData("story.txt"));
        }
        System.out.println("Your story begins.");
        //intro

you You= new you (); 
        //create charactor
You.daying();
musicPlayer.playMusic();
        }catch (Exception e) {
            System.out.println("?：" + e.getMessage());
        }
        
}
}
