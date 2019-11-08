import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class AdditionalTask {

    public static void main(String[] args) {

        String poetry =
                "I want you to know" +
                        "one thing." +
                        "You know how this is:" +

                        "if I look" +

                        "at the crystal moon, at the red branch" +

                        "of the slow autumn at my window," +

                        "if I touch" +

                        "near the fire" +

                        "the impalpable ash" +

                        "or the wrinkled body of the log," +

                        "everything carries me to you," +

                        "as if everything that exists," +

                        "aromas, light, metals," +

                        "were little boats" +

                        "that sail" +

                        "toward those isles of yours that wait for me." +

                        "Well, now," +

                        "if little by little you stop loving me" +

                        "I shall stop loving you little by little." +

                        "If suddenly" +

                        "you forget me" +

                        "do not look for me," +

                        "for I shall already have forgotten you.";

        String poetry1 =
                "To be, or not to be, that is the question:" +
                        "Whether 'tis nobler in the mind to suffer" +
                        "The slings and arrows of outrageous fortune," +
                        "Or to take arms against a sea of troubles" +
                        "And by opposing end them. To die - to sleep," +
                        "No more; and by a sleep to say we end" +
                        "The heart-ache and the thousand natural shocks";


//        char[] alphabet = new char[35];
//        int[] numbers = new int[35];
//        for (int j = 97; j < 123; j++) {
//
//            alphabet[j - 97] = (char) j;
//
//            for (int i = 0; i < poetry.length(); i++) {
//
//                if (poetry.toLowerCase().charAt(i) == ((char) j)) {
//
//                    numbers[j - 97]++;
//                }
//
//            }
//
//            System.out.println(alphabet[j - 97] + "  -   " + numbers[j - 97]);
//        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        System.out.println(poetry.length());
//
//
//        int[] alphabet = new int[256];//Має бути масив int, а не char.
//
//        for (char sym : poetry.toLowerCase().toCharArray()) { //Проходимося по кожному елементу масиву charів,
//            // в який ми перетворили наш string poetry(враховуючи  великі букви)
//
//            alphabet[(int) sym]++;//Ми збільшуємо значення комірки (з індексом коду ASCII визначеного символа) на '1',
//            // коли нам трапляється визначений символ
//        }
//
//        for (int i = 97; i < 123; i++) {
//            System.out.println(i + " -  " + ((char) i) + "  -  " + alphabet[i]);//Код символа  -  символ -
//            // кількість символів у даному рядку
//
//        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println(poetry1.length());


        int[] alphabet = new int[256];

        for (char sym : poetry1.toLowerCase().toCharArray()) {

            alphabet[(int) sym]++;
        }

        for (int i = 0; i < 255; i++) {

            if (alphabet[i] != 0) {
                System.out.println(i + " -  " + ((char) i) + "  -  " + alphabet[i]);

            }

        }


    }


}

