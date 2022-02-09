import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   //throws IOException {
/*
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Start: ");
            int start = scan.nextInt();
            System.out.println("Enter End: ");
            int end = scan.nextInt();

            BufferedReader br = new BufferedReader(new FileReader("/home/masimba/IdeaProjects/Practise/src/Text.txt"));
            File file = new File("/home/masimba/IdeaProjects/Practise/src/Text.txt");

            //add line into array
            String[] arr = {  };
            for (int i = 0; i < file.length(); i++){
                String line = br.readLine();
                arr = Arrays.copyOf(arr, arr.length + 1);
                arr[arr.length - 1] = line;
            }

            for (int i = start; i < end; i++) {
                System.out.println(arr[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
 */

        BasicDrone drone1 = new BasicDrone("Drone1", 1, 0, 0);
        BasicDrone drone2 = new BasicDrone("Drone2", 2, 0, 0);

        double dist = drone1.distanceTo(drone1, drone2);
        System.out.println("Distance: ");
        System.out.println(dist);
    }
}
