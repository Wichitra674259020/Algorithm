import java.util.Scanner;
public class circleArea {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius dagree: ");
        float radius = sc.nextfloat();
        float circleArea = (3.14159f)*radius*radius;
        circleArea = Math.round(circle);
        System.out.println("Area of circle that has radius "+radius+" meters is "+ circleArea + " square meters");
        sc.close();
    }
}