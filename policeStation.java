import java.util.Scanner;

public class policeStation extends place{
    public void push() {
        you a=new you();
        super.push();
        form[0][1]=getProgress(1)+1;
        int now=chanceCalculator(1);

        if(now==1 || getProgress(1)==3){
            System.out.println("You see a gun!");
            if(a.gun()==false){
                a.gun=true;
            }
        }
        if(now==2){
            System.out.print("You met tons of robbers!");
            if(a.gun()==true&a.fireAxe()==true){
                System.out.println("You killed them all!!!");
            }else if(a.gun()==true||a.fireAxe()==true){
                System.out.println("You kill them, but you are hurt");
                a.health=false;
            }else if(a.complexWall()==true&&a.health()==true){
                System.out.println("You rushed back your home and defend them with the wall you've built!");
                System.out.println("They run away");
            }else if(a.all()>=8){
                System.out.println("They took all your food, materials and iron!!!");
                a.materials=0;
                a.food=0;
                a.iron=0;
            }else {
                System.out.println("They killed you as you have nothing!!!");
                a.Dead();
                System.out.println("Bad ending 3:killed by robbers");
            }
        }
        if(now==3){
            System.out.print("You met some robbers");
            if(a.gun()==true||a.fireAxe()==true){
                System.out.print("You killed them easily and get some materials");
                a.getItem(1, 2);
            }
            else if(a.stick()==true){
                System.out.print("You killed them with your stick and get some materials, but the stick broke");
                a.getItem(1, 2);
                a.stick=false;
            }else{
                System.out.print("You escaped from the robbers, but seriously injured");
                if(a.health()==false){
                    a.Dead();
                    System.out.println("You are bleeding too much and you die");
                    System.out.println("Bad ending 3:killde by robbers");
                }
                a.health=false;
            }
        }else{
            System.out.println("You get some materials and some iron");
            a.getItem(1, 3);
            a.getItem(2, 2);
        }
        System.out.println("-----------------------------------");

        if(a.save==false){
            System.out.println("A man asks you for help, he wants to follow you");
            System.out.println("Save him? (If saved, add one food per day consumed)");
            System.out.println("(type 1 to save,other numer to leave)");
            Scanner s=new Scanner(System.in); 
            if(s.nextInt()==1){
                System.out.println("You let him to follow you");
                a.save=true;
            }
            System.out.println("-----------------------------------");
            s.close();
        }
    }


}
