import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    private Node tomManager;


    private class Node {
        private Node parent;
        public int level;
    }


    public static void main(String[] args) throws FileNotFoundException {
        Solution solution = new Solution();

        File[] files = new File(args[0]);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
//        solution.setWorkerA();
//        solution.setWorkerB();
//        solution.setCompanyStructure();
//        System.out.println(solution.findABcommonLowestManagerName());
    }
}
