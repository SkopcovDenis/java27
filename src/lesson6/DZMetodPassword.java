package lesson6;

public class DZMetodPassword {
    /**
     * 2) Метод принимает текстовую переменную (пароль), и должен вернуть true, или false.
     * Если пароль содержит хотя бы одну цифру и заглавную букву и при этом он
     * больше 8ми символов - вернуть true.
     */
    public static boolean validityPassword(String password) {
        int dlinaPassword = password.length();
        System.out.println(dlinaPassword);
        if (dlinaPassword < 8) {
            return false;
        }

        if (password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]))")) {
            return false;
        }
        return true;
    }
}


