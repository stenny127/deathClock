package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalTime todayTime = LocalTime.now();
        System.out.println(todayTime);

        //System.out.println("input your date of birth as yyyy/mm/dd" );
        //LocalDate userDate = LocalDate.parse();

    }
    public static LocalDate dateInput(String userDate) {

        Scanner input = new Scanner(System.in);
            userDate = input.next();
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate date = LocalDate.parse(userDate, dateFormat);


            System.out.println(date);
            return date ;
        }




    }

