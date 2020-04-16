import java.io.*;
import java.util.Scanner;
public class TimeCheck {
        public static void TimeCheck (String[] args) {
                                                                           //TimeCheck beta versions 0.0.0.1

                System.out.print("TimeCheck-started");
                // :)
                //введите колво суток здесь нельзя ниже нуля!!!!!
                int day = 1;
                // --------------

                int chas = 24;
                int minute = 1440;
                int second = 86400;                   //by KotikNarkoTIK
                int milisecond = 86400000;
                //вычисления
                int chas1 = day * chas; // дни умножаются на часы
                int minute1 = minute * chas; //часы на минуты
                int second1 = minute * second; //минуты на секунды
                int milisecond1 = second * milisecond; //секунды на миллесекунды
                //ответы
                System.out.print("chas"+ chas1); //часы
                System.out.print("minute"+ minute1); //минуты
                System.out.print("second"+ second1); //секунды
                System.out.print("milisecond"+ milisecond1); //миллесекунды
                //инфа и автор
                System.out.print("TimeCheck beta versions 0.0.0.1 by KotikNarkoTIK");
        }
                }