public class Task2 {

    public static void main(String[] args) {

        char[] loudLetters = {'а', 'е', 'и', 'є', 'и', 'і', 'ї', 'о', 'у', 'ю', 'я'};

        String poem1 = "Сонце заходить, гори чорніють," +
                "Пташечка тихне, поле німіє," +
                "Радіють люди, що відпочинуть," +
                "А я дивлюся... і серцем лину" +
                "В темний садочок на Україну." +
                "Лину я, лину, думу гадаю," +
                "І ніби серце відпочиває." +

                "Чорніє поле, і гай, і гори," +
                "На синє небо виходить зоря." +
                "Ой зоре! зоре! – і сльози кануть." +
                "Чи зійшла вже на Україні?" +
                "Чи очі карі тебе шукають" +
                "На небі синім? Чи забувають?" +
                "Коли забули, бодай заснули," +
                "Про мою доленьку щоб і не чули.";


        StringBuffer stringBuffer = new StringBuffer(poem1);

        System.out.println("Length = " + stringBuffer.length());


        for (int i = 0; i < poem1.length(); i++) {

            for (int j = 0; j < loudLetters.length; j++)

                if (poem1.charAt(i) == loudLetters[j])
                    stringBuffer.setCharAt(i, '-');


        }
        System.out.println(stringBuffer);
    }

}
