package lesson4;

public class Main {
    public static void main(String[] args) {
        String email = "vocpaks@gmail.com";
        int dlina = email.length();
        System.out.println(dlina);

        String password = "sobakagk";
        int dlinaPassword = password.length();
        System.out.println(dlinaPassword);
        if (dlinaPassword < 8) {
            System.out.println("Пароль слишком короткий!!");
            return;
        }
        //Проверим содержит ли пароль цифры (способ 1)
        if (!password.contains("0") && !password.contains("1")
                && !password.contains("2") && !password.contains("3")
                && !password.contains("4") && !password.contains("5")
                && !password.contains("6") && !password.contains("7")
                && !password.contains("8") && !password.contains("9")) {
            System.out.println("В пароле нет цифр");
            return;
        }
        //Проверим содержит ли пароль цифры (способ 1)
        String[] numbers = {"0" , "1", "2", "3", "4", "5","6" , "7", "8", "9"};
                int countNumInPassword = 0;
                for (int i = 0; i<numbers.length; i++){
                    String currentNum = numbers[i];
                    if (password.contains(currentNum)){
                        countNumInPassword++;
                    }
                }

                if (countNumInPassword < 2){
                    System.out.println("Цифр меньше 2 в пароле");
                    return;
                }
    }
}
