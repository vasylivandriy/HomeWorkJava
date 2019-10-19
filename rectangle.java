public class rectangle {

 static int a_length;
static int b_width;


public rectangle(){
    this.a_length=5;
    this.b_width=10;
    }

public rectangle(int a_length,int b_width){

    this.a_length=a_length;
    this.b_width=b_width;
}

public rectangle(int a_length){   //сторони рівні
    this.a_length=a_length;
    this.b_width=a_length;
}


 static int rec_square(int a_length, int b_width){

   int rec_square = a_length*b_width;
    return rec_square;
}

static int rec_perymeter (int a_length, int b_width){

    int rec_perymeter = a_length + b_width;
    return rec_perymeter;
}


}
