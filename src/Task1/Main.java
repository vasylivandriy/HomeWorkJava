package Task1;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.annotation.Annotation;

public class Main {

    public static void main(String[] args) throws IllegalAccessException, IOException {

        AnnotationMy annotation123 = new AnnotationMy();

        write(annotation123, annotation123.getClass());

    }

    static void write(Object object, Class clas) throws IllegalAccessException, IOException {

        File file = new File("WriteFields.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file,true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);

        Field[] declaredFields = clas.getDeclaredFields();

        for (Field field : declaredFields) {

            Annotation[] declaredAnnotations = field.getDeclaredAnnotations();

            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().equals(MyAnnotation.class)) {
                    System.out.println(annotation);
                    System.out.println(field.toString());
                    System.out.println(field.get(object));

                    outputStreamWriter.write(field.getName()+"\n");

                    outputStreamWriter.write(field.toString()+"\n");

                    outputStreamWriter.write(field.get(object)+"\n");


                }
            }

        }

        outputStreamWriter.close();
        fileOutputStream.close();

    }


}
