import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> queue = new LinkedList<>(firstClients);

        while (!queue.isEmpty()) {
            String client = queue.poll();

            System.out.println(client + " сделала новый маникюр.");

            if (Math.random() < 0.5) {
                String friend = "a friend of " + client;
                queue.add(friend);
                System.out.println("Новый клиент записался: " + friend);
            }
        }
    }
}
