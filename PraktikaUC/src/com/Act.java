package com;


import java.util.ArrayList;
import java.util.Scanner;

public class Act {

    protected static final ArrayList<String> patients = new ArrayList<>();
    protected static final ArrayList<String> doctors = new ArrayList<>();
    protected static Scanner s = new Scanner(System.in);

     public Act() {
         System.out.println("help - список команд");
         setCommand();

     }

     public void setCommand() {
         System.out.print("Напишите команду: ");
         String command = s.nextLine();

             switch (command) {
                 case ("help"):
                     helpList();
                     setCommand();
                     break;
                 case ("setPatients"):
                     Patients.setPatients();
                     setCommand();
                     break;
                 case ("getPatients"):
                     Patients.getPatients();
                     setCommand();
                     break;
                 case ("removePatients"):
                     Patients.removePatients();
                     setCommand();
                     break;
                 case ("changePatients"):
                     Patients.changePatients();
                     setCommand();
                     break;
                 case ("getDoctors"):
                     Doctors.getDoctors();
                     setCommand();
                     break;
                 case ("setDoctors"):
                     Doctors.setDoctors();
                     setCommand();
                     break;
                 case ("removeDoctors"):
                     Doctors.removeDoctors();
                     setCommand();
                     break;
                 case ("setAppoint"):
                     AppData.setAppoint();
                     setCommand();
                     break;
                 case ("getAppoint"):
                     AppData.getAppoint();
                     setCommand();
                     break;
                 case ("changeAppoint"):
                     AppData.changeAppoint();
                     setCommand();
                     break;
                 case ("removeAppoint"):
                     AppData.removeAppoint();
                     setCommand();
                     break;
                 default:
                     System.out.println("Ошибка: неправильная команда");
                     setCommand();
             }

     }


     public void helpList() {
         System.out.println("Добавить нового пациента: setPatients");
         System.out.println("Вывести список пациентов: getPatients");
         System.out.println("Удалить пациента: removePatients");
         System.out.println("Изменить фио пациента: changePatients");
         System.out.println("Вывести список врачей: getDoctors");
         System.out.println("Добавить врача: setDoctors");
         System.out.println("Удалить врача: removeDoctors");
         System.out.println("Добавить прием: setAppoint");
         System.out.println("Вывести список приемов: getAppoint");
         System.out.println("Изменить прием: changeAppoint");
         System.out.println("Удалить прием: removeAppoint");
     }

}
