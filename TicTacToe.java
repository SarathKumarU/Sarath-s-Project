import java.util.*;

public class TicTacToe {

    static void display(char arr[], int len) {
        System.out.println();
        System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2]);
        System.out.println(arr[3] + " | " + arr[4] + " | " + arr[5]);
        System.out.println(arr[6] + " | " + arr[7] + " | " + arr[8]);
        System.out.println();
    }

    static int checkWin(char arr[], int len, int flag) {
        for (int i = 0; i <= 6; i += 3) { // row
            if (arr[i] == ' ') {
                break;
            } else {
                if ((arr[i] == arr[i + 1]) && (arr[i + 1] == arr[i + 2])) {
                    System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
                    System.out.println("----Player " + arr[i] + " won the game!----\n");
                    return -1;
                }
            }
        }

        for (int i = 0; i <= 2; i += 1) { // col
            if (arr[i] == ' ') {
                break;
            } else {
                if ((arr[i] == arr[i + 3]) && (arr[i + 3] == arr[i + 6])) {
                    System.out.println("----Player " + arr[i] + " won the game!----\n");
                    return -1;
                }
            }
        }

        if (arr[0] != ' ' && (arr[0] == arr[4]) && (arr[4] == arr[8])) { // diag1
            System.out.println("----Player " + arr[0] + " won the game!----\n");
            return -1;
        }

        else if (arr[0] != ' ' && (arr[2] == arr[4]) && (arr[4] == arr[6])) { // diag2
            System.out.println("----Player " + arr[2] + " won the game!----\n");
            return -1;
        } else {
            return flag;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char arr[] = new char[9];
        Arrays.fill(arr, ' ');
        int flag = 0;

        while (flag != 9) {
            System.out.print("Player X: Enter the position to occupy: ");
            int choice1 = sc.nextInt();
            while (arr[choice1 - 1] != ' ') {
                System.out.print("\nAlready filled, please choose another position: ");
                choice1 = sc.nextInt();
            }
            arr[choice1 - 1] = 'X';
            flag++;
            display(arr, 8);
            if (flag >= 5) {
                if (checkWin(arr, 8, flag) == -1) {
                    break;
                } else if (checkWin(arr, 8, flag) == 9) {
                    System.out.println("----Draw!----");
                }
            }

            System.out.print("Player O: Enter the position to occupy: ");
            int choice2 = sc.nextInt();
            while (arr[choice2 - 1] != ' ') {
                System.out.print("\nAlready filled, please choose another position: ");
                choice2 = sc.nextInt();
            }
            arr[choice2 - 1] = 'O';
            flag++;
            display(arr, 8);
            if (flag >= 5) {
                if (checkWin(arr, 8, flag) == -1) {
                    break;
                } else if (checkWin(arr, 8, flag) == 9) {
                    System.out.println("----Draw!----");
                }
            }
        }
    }
}