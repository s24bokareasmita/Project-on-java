import java.util.Scanner;

public class MiniMusic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] title = new String[20];
        String[] artist = new String[20];
        int count = 0;

        while (true) {
            System.out.println("\n1.Add  2.Display  3.Search  4.Delete  5.Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {

                case 1:  // Add Song
                    System.out.print("Enter Song Title: ");
                    title[count] = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    artist[count] = sc.nextLine();

                    count++;
                    System.out.println("Song Added!");
                    break;

                case 2:  // Display
                    System.out.println("\n--- Song List ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println((i+1) + ". " + title[i] + " - " + artist[i]);
                    }
                    break;

                case 3:  // Search Song
                    System.out.print("Enter title to search: ");
                    String s = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (title[i].equalsIgnoreCase(s)) {
                            System.out.println("Found: " + title[i] + " - " + artist[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Song Not Found");
                    break;

                case 4: // Delete Song
                    System.out.print("Enter title to delete: ");
                    String del = sc.nextLine();
                    boolean deleted = false;

                    for (int i = 0; i < count; i++) {
                        if (title[i].equalsIgnoreCase(del)) {

                            // shift elements left
                            for (int j = i; j < count - 1; j++) {
                                title[j] = title[j+1];
                                artist[j] = artist[j+1];
                            }

                            count--;
                            System.out.println("Song Deleted!");
                            deleted = true;
                            break;
                        }
                    }

                    if (!deleted)
                        System.out.println("Song Not Found");
                    break;

                case 5:
                    System.out.println("Exit...");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
