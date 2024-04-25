import java.util.Scanner;

public class office extends place{

    
    public void push() {
        you a=new you();
        super.push();
        form[0][0]=getProgress(0)+1;
        int now=chanceCalculator(0);

        if(now==1 || getProgress(0) == 4){
            System.out.println("You see a helecopter!");
            if(a.gun==true){
                if(a.save2==false){
                    System.out.println("You used your pistol, attracted the helicopter, and it took you out of this mess.");
                System.out.println("Good ending # 1: The plane escape(uncommon)");
                a.getEscape();
                }else{
                    System.out.println("The helecopter is too small for all of you");
                    System.out.println("Type 1 to leave; Type 2 to save the woman and a child");
                    Scanner qwq=new Scanner(System.in);
                    if(qwq.nextInt()==1){
                        System.out.println("You used your pistol, attracted the helicopter, and it took you out of this mess.");
                        System.out.println("Good ending? # 0.1: The plane escape(...)");
                a.getEscape();
                         
                    }else{
                        System.out.println("The woman and the child escape.");
                    }
                    qwq.close();
                }
                
            }
            else{
                if(Math.random()>0.4){
                System.out.println("You used your pistol, attracted the helicopter, and it took you out of this mess.");
                System.out.println("Good ending # 1.5: The plane escape(rare)");
                a.getEscape();
                
                }else{
                    System.out.println("QWQ, it didn't notice you and left...");
                }
            }
        }
        if(now==2){
            System.out.print("You saw a closed case left by sb!");
            if(a.stick==true){
                System.out.println("You managed to open it with your sticks");
            }else{
                System.out.println("You managed to open it with your hands");
                System.out.println("But hurt yourself badly!");
                System.out.println("You are bleeding!");
                if(a.health()==false){
                    a.Dead();
                    System.out.println("You'v injured, so...'");
                    System.out.println("Bad ending 1:killed by a case :)");
                }else{
                    a.getItem(5,0);
                }
            }
        }
        if(now==3){
            System.out.print("You met some zombies");
            if(a.gun()==true||a.fireAxe()==true){
                System.out.print("You killed them easily and get some materials");
                a.getItem(1, 2);
            }
            else if(a.stick()==true){
                System.out.print("You killed them with your stick and get some materials, but the stick broke");
                a.getItem(1, 2);
                a.stick=false;
            }else{
                System.out.print("You escaped from the zombies, but seriously injured");
                if(a.health==false){
                    a.Dead();
                System.out.println("Bad ending 4:killed by zombie");

                }
                a.health=false;
            }
            if(a.save2==false){
                System.out.println("You found a woman and a child");
                if(a.food>=2){
                System.out.println("Save them? (If saved, you need to give them 2 food)");
                System.out.println("(type 1 to give food,other numer to leave)");
                Scanner sc=new Scanner(System.in);
                if(sc.nextInt()==1){
                    System.out.println("You give them 2 food");
                    a.save2=true;
                    a.food-=2;
                    sc.close();
                }
                }
            }

        }else{
            System.out.println("You get some materials and some iron");
            a.getItem(1, 2);
            a.getItem(2, 1);
        }

    }


}