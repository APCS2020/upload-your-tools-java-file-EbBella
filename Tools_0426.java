import java.util.Scanner;

public class Tools_0426{
    /**print a line on the screen
     * @param width how many times print charactor str 
     * @param length the charactor for printing
     */

    // method 1
    public static void printLine(int width, int length, String str){
        for (int i = 0; i < length; i++){
            System.out.print(str);
        }
        System.out.println();
    }

    // method 2
    public static void printSquare(int width, int length, String str){
        for (int i = 0; i < length; i++){
            printLine(width, length, str);
        }
    }

    // method 3
    public static void printRectangle(int width, int length, String str){
        for (int r = 0; r < width; r++){
            printLine(width, length, str);
        }
    }

    // get a integer from user input
    // improt java.util.Scanner
    public static int getInt(){
        System.out.println("Enter an Integer: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }
    public static int getInt(String str){
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    // get a String
    public static String getStr(){
        System.out.println("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
    /**
     * public:范围
     * static: class methods, className.toolsName()
     * String: the type of return, void: non return
     * getStr: methodName
     * (String str): parameter list, (int x, int y, String str)
     * (int x) <> )(int a)
     * @param str
     * @return
     */

    // add method in Tools_0426.java
    public static int add(int a, int b){
        return a+b;
    }

    /**Change x to 5
     * but this method don't work as intended
     * because java pass parameter by value
     * @param x
     * @return
     */

    // local variable 局部变量
    // public static void modify(int x){
    //     x=5
    // }
     
    public static int modify(int x){
        return x - 5;
    }

    public static String weekday(int y){
        if(y==1){
            return "Monday";
        }
        else if(y==2){
            return "Tuesday";
        }
        else if(y==3){
            return "Wednesday";
        }
        else if(y==4){
            return "Thursday";
        }
        else if(y==5){
            return "Friday";
        }
        else if(y==6){
            return "Saturday";
        }
        else if(y==7){
            return "Sunday";
        }
        else{
            return "Are you stupid??? HAHAHAHAHA~";
        }
    }
    
    public static String numTriangle(int n){
        String tmp = ""; // "" empty 空串 null 空
        for (int i=0, i<n, i++){
            for (int j=1, j<=i+1, j++){
                tmp += j;
            }
            tmp += "\n";
        }
        return tmp;
    }

} 