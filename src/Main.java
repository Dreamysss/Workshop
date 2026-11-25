void main() {
    IO.println("Welcome \n1. Admin \n2. User \n3. Guest");

    int user_input = Integer.parseInt(IO.readln("Role (1-3): "));

    if (user_input <= 2) {

        int level = switch (user_input) {
            case 1 -> 3;
            case 2 -> 2;
            case 3 -> 1;
            default -> 0;
        };

        if (user_input == 1 || user_input == 2) {
            String username = IO.readln("Username: ");
            String password = IO.readln("Password: ");



            if (username.trim().toLowerCase().equals("amri") && password.trim().equals("amri1")) {
                System.out.printf("Hyrja me sukses! Hapsira juaj e liruar: " + (level * 2.5) + "GB" );
            } else if (username.trim().toLowerCase().equals("arta") && password.trim().equals("hacker123!")) {
                System.out.printf("Hyrja me sukses! Hapsira juaj e liruar: " + (level * 2.5) + "GB");
            } else {
                IO.println("Keni gabuar tek Emri i perdoruesit apo Fjalkalimin!");
            }


        }

    } else if (user_input == 3){
        IO.println("Keni hyr si Musafir, nuk ka nevoj password!");
    } else {
        IO.println("Gabim Zgjedhje!");
    }

}