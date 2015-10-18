package com.circle;



/**
 * Created by Pavel on 12.09.2015.
 */
public class Main{
    public static void main(String[] args) {
        // Демонстрация конструкторов и метода ввода
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(2,-1,0);


        //Вывод информации по всем объектам
        firstCircle.outputCircle();
        secondCircle.outputCircle();


        System.out.println("Демонстрация остальных методов будет происходить с помощью этой окружности:");
        firstCircle.outputCircle();
        System.out.println("Площадь окружности: " + firstCircle.lengthOfCircle() +
                        "; Длина окружности: " + firstCircle.areaOfCircle()
        );

        System.out.println("Для демонстрации метода 'Сравнение площадей' введите данные для второй окружности.");
        secondCircle.inputCircle();
        if(firstCircle.equalsCircle(secondCircle)){
            System.out.println("Круги равны по площади. "+"s1 = "+firstCircle.areaOfCircle()+ ";"+" s2 = "+
                    secondCircle.areaOfCircle() );
        }
        else{
            System.out.println("Круги не равны по площади. "+"s1 = "+firstCircle.areaOfCircle()+ ";"+" s2 = "+
                    secondCircle.areaOfCircle() );
        }

        System.out.println("Сейчас координаты центра окружности = ");
        firstCircle.outputCircle();
        firstCircle.movingCenter();
        System.out.println("Теперь мы перенесём центр окружности в случайную точку, и они стали равны:");
        firstCircle.outputCircle();

        System.out.println("Расстояние между центрами окружностей равно "+
                firstCircle.distanceBetweenMid(secondCircle)
        );
        if(firstCircle.pointOfTouch(secondCircle)){
            System.out.println("Окружности касаются в одной точке");
        }
        else{
            System.out.println("Окружности не касаются в одной точке");
        }
    }
}
