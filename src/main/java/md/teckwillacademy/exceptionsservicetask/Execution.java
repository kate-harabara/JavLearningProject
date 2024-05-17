package md.teckwillacademy.exceptionsservicetask;

import java.io.FileNotFoundException;

public class Execution {
    public static void main(String[] args) {
        try {
            TextManager.readWithoutTryAndCatch("sasaa");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
