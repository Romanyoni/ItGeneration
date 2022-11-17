//        Стовпці електронних таблиць (типу Excel)
//        мають буквену нумерацію у вигляді латинських великих літер
//        (послідовно, зліва направо):
//        A, B, ..., Y, AA, AB, ..., AY, AZ, BA, BB, ... тощо.
//        При цьому кожна графа має свій порядковий номер:
//        А - 1; Б - 2; ... ; Y - 25; ... тощо
//        Напишіть клас, який містить такі три методи:
//        1. метод визначення порядкового номера стовпця за його
//        буквеним номером
//        2. метод визначення літери стовпця за його порядковим
//        номером використовуючи літеру стовпця
//        3.напишіть метод визначення номера стовпця, який розміщено
//        праворуч від заданого.

public class SubTask6
{
    public static void main(String[] args)
    {
        System.out.println("\nSubTask6. " + columNumber("abc"));
        columnLetters(73178);
        rightColumNumber("abc");
    }

    public static int columNumber(String yourInput)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int columnNumber = 0;
        for (int i = 0; i < yourInput.length(); i++)
        {
            if (i > 0)
            {
                columnNumber = alphabet.length() * columnNumber;
            }
            columnNumber += alphabet.indexOf(yourInput.toUpperCase().charAt(i)) + 1;
        }
        return (columnNumber);
    }

    public static void columnLetters(int yourInput)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String columnLetters = "";
        for (double i = yourInput; i > 1; i = i / 26)
        {
            columnLetters += alphabet.charAt((int) (i % 26 - 1));
        }

        String columnLettersReverse = "";
        for (int i = 0; i < columnLetters.length(); i++)
        {
            columnLettersReverse += columnLetters.charAt(columnLetters.length() - 1 - i);
        }
        System.out.println("SubTask6. " + columnLettersReverse);
    }

    public static void rightColumNumber(String yourInput)
    {
        columnLetters(columNumber(yourInput) + 1);
    }
}