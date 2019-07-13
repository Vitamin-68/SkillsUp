package HomeWork1;

public class Main {

    public static void main(String[] args) {
        char charVariable = 'h';
        Character charVariable2 = 'G';
        byte byteVariable = 1;
        Byte byteVariable2 = 127;
        short shortVariable = -2;
        Short shortVariable2 = 20;
        int intVariable = 30;
        Integer intVariable2 = 310;
        long longVariable = 4000;
        Long longVariable2 = 4444L;
        float floatVariable = 5.5f;
        Float floatVariable2 = 5.85f;
        double doubleVariable = 6.67;
        Double doubleVariable2 = 602.888;
        boolean booVariable = false;
        Boolean booVariable2 = true;
        System.out.println("charVariable = " + charVariable);
        System.out.println("charVariable2 = " + charVariable2);
        System.out.println("byteVariable = " + byteVariable);
        System.out.println("byteVariable2 = " + byteVariable2);
        System.out.println("shortVariable = " + shortVariable);
        System.out.println("shortVariable2 = " + shortVariable2);
        System.out.println("intVariable = " + intVariable);
        System.out.println("intVariable2 = " + intVariable2);
        System.out.println("longVariable = " + longVariable);
        System.out.println("longVariable2 = " + longVariable2);
        System.out.println("floatVariable = " + floatVariable);
        System.out.println("floatVariable2 = " + floatVariable2);
        System.out.println("doubleVariable = " + doubleVariable);
        System.out.println("doubleVariable2 = " + doubleVariable2);
        System.out.println("booVariable = " + booVariable);
        System.out.println("booVariable2 = " + booVariable2);

        String stringVar = "It was ";
        String stringVar2 = "not difficult";
        System.out.println();
        System.out.println(stringVar + stringVar2);

//        Площадь треугольника = 1/2 основания треугольника * на высоту
//        Площадь круга = Пи * радиус в квадрате
        double areaTriangle, areaCircle;
        int baseTriangle = 7, heightTriangle = 5;
        int radiusCircle = 5;
        areaTriangle = 1 / 2. * baseTriangle * heightTriangle;
        areaCircle = Math.PI * radiusCircle *radiusCircle;
        System.out.println();
        System.out.println("Высота треугольника = " + heightTriangle);
        System.out.println("Основание треугольника = " + baseTriangle);
        System.out.println("Площадь треугольника = " + areaTriangle);

        System.out.println();
        System.out.println("Радиус круга = " + radiusCircle);
        System.out.println("Площадь круга = " + areaCircle);



    }
}
