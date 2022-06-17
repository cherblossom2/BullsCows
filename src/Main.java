import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Игра быки коровы");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберите тип игры: \nбез ограничений: 0 \nпо попыткам: 1 \nпо времени: 2\n");

        int gameType = scanner.nextInt();

        BullsCows game = new BullsCows(gameType);

        while (true) {
            System.out.println("Игра началась");
            game.startGame();

            System.out.print("Если хотите закончить игру напишите (yes/no): ");
            if ("yes".equals(scanner.next())){
                System.out.println("Игра закончена");
                break;
            }

            System.out.print("Если вы хотите поменять режим напишите его номер: ");
            int newGameType = scanner.nextInt();

            if (newGameType != gameType) {
                game.setGameType(newGameType);
            }
        }
    }
}