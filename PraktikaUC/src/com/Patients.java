package com;

import java.util.ArrayList;

public class Patients extends Act {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() {
        System.out.print("ФИО пациента: ");
        String name = s.nextLine();
        patients.add(name);
        System.out.print("ID пациента: ");
        int id = s.nextInt();
        idPatients.add(id);
        System.out.print("Введите дату регистрации: ");
        String date = s.nextLine();
        date = s.nextLine();
        datePatients.add(date);
    }

    public static void removePatients() {
        getPatients();
        System.out.print("Напишите номер пациента по счету, начиная с 0, для удаления: ");
        int number = s.nextInt();
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
    }


    public static String getPatients() {
        for(int i = 0; i < idPatients.size(); i++) {
            System.out.print("ID: " + idPatients.get(i));
            System.out.print(" ФИО: " + patients.get(i));
            System.out.print(" Дата регистрации: " + datePatients.get(i) + "\n");
        }
        return "Operation completed";
    }
    public static void changePatients() {
        getPatients();
        System.out.print("Напишите номер пациента по счету, начиная с 0, для изменения: ");
        int number = s.nextInt();
        System.out.print("Напишите новое фио пациента: ");
        String name = s.nextLine();
        name = s.nextLine();
        patients.set(number, name);
    }


}
