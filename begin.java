import java.util.Scanner;
public class begin {
    int power=0;
public void begining(){
    Scanner a = new Scanner(System.in);
System.out.println("Type you name:");
String name= a.next();
System.out.println("Skip intro & rules,"+name+"?(type 1 to skip)");
int choice=a.nextInt();
if(choice !=1){
    System.out.println(FileReader.getStringData("story.txt"));
}
System.out.println("Your story begins.");
a.close();
}
}

