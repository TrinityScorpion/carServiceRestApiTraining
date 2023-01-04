package cars.service.carService.support;


import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;

public class Start extends Test{
    static String str;

    public void Start(){
        System.out.println("in construcotr");
        str = "Hello";
    }

    public static void main(String[] args) {
        short s=9;
//        System.out.println(add(s,6));
    }


    public int add(String a, String b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("aRGUMENT A OR B ARE REQUIRED");
        }
        return Integer.parseInt(a) + Integer.parseInt(b);
    }
}


