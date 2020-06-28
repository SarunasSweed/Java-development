package com.company.firstgitproject.DataE;

import java.math.BigDecimal;
import java.util.Scanner;

public class Datae1 {
    public static void main(String[]args){
        //1
        System.out.println(74 + 36 );

        {
            //2
            System.out.printf("%d + %d * %d = %d\n", -5, 8, 6, -5 + 9 * 6);
            System.out.printf("(%d + %d) %% %d = %d\n",55,9,9, (55+9) % 9 );
            System.out.printf("%d + %d * %d /%d = %d\n", 20,-3,5, 8,20 + -3 * 5 / 8 );
            System.out.printf("%d + %d / %d * %d - %d %% %d = %d\n", 5,15,3,2,8,3, 5 + 15 / 3 * 2 - 8 % 3 );

        }
        {
            //3
            System.out.printf("((%.1f * %.1f - %.1f * %.1f)/(%.1f - %.1f)) = %.15f\n",25.5, 3.5 , 3.5, 3.5 ,40.5 , 4.5,(25.5 * 3.5 - 3.5 * 3.5)/ (40.5 - 4.5));
        }
        {
            //4

            System.out.printf("%d / %d = %d remainder %d\n", 50, 3, 50/3, 50%16);
        }
        {
            //5

            final double radius = 7.5;

            Double perimeter = 2 * Math.PI * radius;
            Double area = Math.PI * Math.pow(radius, 2);
            System.out.printf("Area = %14f Perimeter = %14f\n", area, perimeter);
            {
                //6
                int x = 10;
                int y = 20;
                int z = 30;
                double average = (x + y + z) / 3.0;

                System.out.printf("Average is %.0f\n", average);
            }
        }
           /* {
           //7
                final double width = 5.5f;
                final double height = 8.5f;

                double perimeter = (width + height) * 2;
                double area = width * height;

                System.out.printf("Area = %.2f , Perimeter = %.2f\n", area, perimeter);
            }

            */
            {
                //8
                int a = 5;
                int b = 13;
                int temp;
                System.out.printf("Before swap:\n a = %d; b = %d\n",a,b);

                temp = a;
                a=b;
                b = temp;

                System.out.printf("After swap:\n a = %d; b = %d\n",a ,b);


            }
            {
                //9
                if (25!=39);
                System.out.printf("23 != 39\n");
                if (25<39)
                    System.out.printf("25 < 39\n");
                if (25<=39)
                    System.out.printf("25 <= 39\n");

            }
        {
            //10
            // int x = 133;
            //       int digit1;
            //       int digit2;
            //       int digit3;
            //
            //       digit1 = x / 100;
            //       digit2 = x % 100 / 10;
            //       digit3 = x % 100 % 10;
            //
            //       int sum = digit1+digit2+digit3;
            //
            //       System.out.printf("All digits of number %d is:\n%d\n%d\n%d\n And the sum is: %d ",x , digit1, digit2, digit3, sum);
        }

    }
}


