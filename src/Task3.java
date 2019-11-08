public class Task3 {

    public static void main(String[] args) {

        String poem = "Сонце заходить, гори чорніють," +
                "Пташечка тихне, поле німіє," +
                "Радіють люди, що відпочинуть," +
                "А я дивлюся... і серцем лину" +
                "В темний садочок на Україну.";


        String[] word = poem.toLowerCase().split("[, ?.@]");

        System.out.println("Number of the text words = " + word.length);


    }

}
