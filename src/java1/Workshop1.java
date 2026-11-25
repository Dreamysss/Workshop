void main() {
    IO.println("Mire se erdhe! \n1. Admin \n2. User \n3. Guest \n4. Operator");

    int user_input;
    try {
        user_input = Integer.parseInt(IO.readln("Role (1-4): ").trim());
    } catch (NumberFormatException e) {
        IO.println("Gabim Zgjedhje!");
        return;
    }

    int level = switch (user_input) {
        case 1 -> 4;
        case 2 -> 2;
        case 3 -> 1;
        case 4 -> 3;
        default -> 0;
    };

    if (level == 0) {
        IO.println("Gabim Zgjedhje!");
        return;
    }

    if (user_input == 3) {
        IO.println("Keni hyr si Musafir, nuk ka nevoj password!");
        return;
    }


    String username = IO.readln("Username: ").trim().toLowerCase();
    String password = IO.readln("Password: ").trim();

    if (password.isEmpty()) {
        IO.println("Nuk mund te jet Password-i bosh.");
        return;
    }

    boolean valid =
            (username.equals("amri") && password.equals("amri1")) ||
                    (username.equals("arta") && password.equals("hacker123!")) ||
                    (username.equals("operator") && password.equals("0p3r!2026"));

    if (valid) {
        IO.println("Hyrja me sukses! Hapsira juaj e liruar: " + (level * 2.5) + "GB");
    } else {
        IO.println("Keni gabuar tek Emri i perdoruesit apo Fjalkalimin!");
    }
}