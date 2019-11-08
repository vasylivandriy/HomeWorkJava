public class Task4 {

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


        String[] sentence = poetry.toLowerCase().split("[?.!]");

        System.out.println("Number of the senrences in this text = " + sentence.length);


        for (int i = 0; i < sentence.length; i++) {

            System.out.println(sentence[i]);

        }

    }
}
