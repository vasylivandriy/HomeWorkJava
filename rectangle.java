
public class rectangle {

    private int a_length;
    private int b_width;


    public rectangle() {
        this.a_length = 5;
        this.b_width = 10;
    }

    public rectangle(int length, int width) {

        if (length > 0 && width > 0) {
            this.a_length = length;
            this.b_width = width;
        } else {
            System.out.println("Довжина та ширина прямокутника не може бути від'ємною чи дорівнювати'0', введіть інше значення:");
        }
    }
   public rectangle(int a_length) {   //сторони рівні
            if (a_length > 0) {
                this.a_length = a_length;
                this.b_width = a_length;
            } else {
                System.out.println("Довжина прямокутника не може бути від'ємною чи дорівнювати'0', введіть інше значення:");
            }
        }


        public int getA_length(){
            return a_length;
        }

        public void setA_length (int a_length){

            if (a_length > 0) this.a_length = a_length;
            else System.out.println("Довжина прямокутника не може бути від'ємною чи дорівнювати'0'");
        }

        public int getB_width () {
            return b_width;
        }

        public void setB_width ( int b_width){

            if (b_width > 0) this.b_width = b_width;
            else System.out.println("Ширина прямокутника не може бути від'ємною чи дорівнювати'0'");
        }





        static int rec_square ( int a_length, int b_width){

            int rec_square = a_length * b_width;
            return rec_square;
        }

        static int rec_perymeter ( int a_length, int b_width){

            int rec_perymeter = a_length + b_width;
            return rec_perymeter;
        }





    }
