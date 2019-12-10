package Task1;

import java.lang.annotation.Target;

public class AnnotationMy {
       @MyAnnotation(str = "MyAnnot1", value = 65)
     String name = "Taras";
     @MyAnnotation(str = "MyAnnot2", value = 36)
       int age = 45;

     double abc = 20.0;

    @Deprecated
    @MyAnnotation(str = "MyAnnot3", value = 56)
     void myMetgod(){

        int a = age + 56;

        System.out.println(name + " -- " + age + " -- " + abc + " --  " + a);

    }


}
