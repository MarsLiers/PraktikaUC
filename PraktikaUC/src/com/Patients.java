package com;

import java.util.ArrayList;

public class Patients extends Act {

    private static final ArrayList<Integer> idPatients = new ArrayList<>();
    private static final ArrayList<String> datePatients = new ArrayList<>();

    public static void setPatients() {
        System.out.print("��� ��������: ");
        String name = s.nextLine();
        patients.add(name);
        System.out.print("ID ��������: ");
        int id = s.nextInt();
        idPatients.add(id);
        System.out.print("������� ���� �����������: ");
        String date = s.nextLine();
        date = s.nextLine();
        datePatients.add(date);
    }

    public static void removePatients() {
        getPatients();
        System.out.print("�������� ����� �������� �� �����, ������� � 0, ��� ��������: ");
        int number = s.nextInt();
        idPatients.remove(number);
        patients.remove(number);
        datePatients.remove(number);
    }


    public static String getPatients() {
        for(int i = 0; i < idPatients.size(); i++) {
            System.out.print("ID: " + idPatients.get(i));
            System.out.print(" ���: " + patients.get(i));
            System.out.print(" ���� �����������: " + datePatients.get(i) + "\n");
        }
        return "Operation completed";
    }
    public static void changePatients() {
        getPatients();
        System.out.print("�������� ����� �������� �� �����, ������� � 0, ��� ���������: ");
        int number = s.nextInt();
        System.out.print("�������� ����� ��� ��������: ");
        String name = s.nextLine();
        name = s.nextLine();
        patients.set(number, name);
    }


}
