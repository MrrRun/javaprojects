//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import exception.NumValidate;
import view.Menu;
import java.util.Scanner;

import service.CourseServiceImp;


public class Main {
    public static void main(String[] args) throws NumValidate {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            Menu.menu();
            System.out.print("\nInsert one option  : ");
            Integer option = new Scanner(System.in).nextInt();
            CourseServiceImp courseServiceImp = new CourseServiceImp();
            switch (option) {
                case 1: {
                    courseServiceImp.addNewCourse();
                    break;
                }
                case 2: {
                    courseServiceImp.listCourse();
                    break;
                }
                case 3: {
                    courseServiceImp.findById();
                    break;
                }
                case 4: {
                    courseServiceImp.findByTitle();
                    break;
                }
                case 5: {
                    courseServiceImp.removeCourse();
                    break;
                }
                case 0,99:
                    System.out.println("Good bye....!!");
                    exit = true;
                    break;
                default: {
                    System.out.println("Wrong input !");
                    break;
                }
            }
        }

    }
}