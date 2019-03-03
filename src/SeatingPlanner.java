/**
 * @author Sharon Hains
 */

import java.util.Scanner;

public class SeatingPlanner {

    public SeatingPlanner (){
    }

    public void newTable(){
        Table table = new Table();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter table size: ");
        int tableSize = input.nextInt();

        table.setTableSize(tableSize);
        System.out.print("Table Size: "+table.getTableSize());
    }

    public static void main (String [ ] args){
        SeatingPlanner seatingPlanner = new SeatingPlanner();
        seatingPlanner.newTable();
    }
}

