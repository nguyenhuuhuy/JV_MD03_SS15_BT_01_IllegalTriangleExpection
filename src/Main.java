
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException{
        Scanner sc = new Scanner(System.in);
        Main triangle = new Main();
        int x = 0, y = 0, z = 0;
        try{
            System.out.println("nhập cạnh 1: ");
            x = Integer.parseInt(sc.nextLine());
            System.out.println("nhập cạnh 2: ");
            y = Integer.parseInt(sc.nextLine());
            System.out.println("nhập cạnh 3: ");
            z = Integer.parseInt(sc.nextLine());
            if (x<=0||y<=0||z<=0){
                throw new IllegalTriangleException("Nhập không hợp lệ");
            }
        } catch (NumberFormatException numberFormatException){
            numberFormatException.printStackTrace();
        }

        try{
            triangle.triangleSide(x,y,z);
        } catch (IllegalTriangleException illegalTriangleException){
            System.out.println("Err: "+illegalTriangleException.getMessage());
        }
        System.out.println("back!");
    }

    public String triangleSide(int x, int y, int z) throws IllegalTriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalTriangleException("Không phải tam giác");
        } else if (x == y && x == z) {
            return ("Tam giác đều");
        } else if (x == y || x == z || y == z) {
            return ("Tam giác cân!");
        } else if ((x + y > z) && (x + z > y) && (y + z > x)) {
            return ("Tam giác thường!");
        } else {
            throw new IllegalTriangleException("Không phải tam giác");
        }
    }
}
