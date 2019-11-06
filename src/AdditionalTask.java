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


        char[] alphabet = new char[35];
        int[] numbers = new int[35];
        for (int j = 97; j < 123; j++) {

            alphabet[j - 97] = (char) j;

            for (int i = 0; i < poetry.length(); i++) {

                if (poetry.toLowerCase().charAt(i) == ((char) j)) {

                    numbers[j - 97] += 1;
                }

            }

            System.out.println(alphabet[j - 97] + "  -   " + numbers[j - 97]);
        }


//for (char sym: poetry.toLowerCase().toCharArray()){
//
//    alphabet [(int)sym]++;
//
//    System.out.print(alphabet[(int)sym]);
//}
//
//        System.out.println();


//for (int i=97; i<123; i++){
//
//    System.out.println((char)alphabet[i]+" - "+alphabet[i]);
//}
//

    }


}

