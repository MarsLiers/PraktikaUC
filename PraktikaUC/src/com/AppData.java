package com;

import java.util.ArrayList;


public class AppData extends Act {
    private static final ArrayList<String> appointmentPatients = new ArrayList<>();
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>();
    private static final ArrayList<String> time = new ArrayList<>();
    protected static final ArrayList<String> status = new ArrayList<>();

    public static void setAppoint() {
        System.out.println(Patients.getPatients());
        System.out.print("������� ��� �������� ��� ������: ");
        String name = s.nextLine();
        System.out.println(Doctors.getDoctors());
        System.out.print("������� ��� ������� ��� ������: ");
        String name1 = s.nextLine();
        System.out.print("������� ����� ������ �� ����� � ������� \"dd-MM HH:mm\": ");
        String time1 = s.nextLine();
        time1 = s.nextLine();
        appointmentPatients.add(name);
        appointmentDoctors.add(name1);
        time.add(time1);
        status.add("�����");
    }



    public static void changeAppoint() {
        getAppoint();
        System.out.print("�������� ����� ������ �� �����, ������� � 0, ������ �������� ������ ��������: ");
        int number = s.nextInt();
        System.out.println("������ ��������: �����, � ��������, �������, ������� ������, ��������");
        System.out.print("�������� � �������� ������ � ���� ������ ��� ���������: ");
        String status1 = s.nextLine();
        status.set(number,status1);
        }


    public static void removeAppoint() {
        getAppoint();
        System.out.print("�������� ����� ������ �� �����, ������� � 0, ��� ��������: ");
        int number = s.nextInt();
        appointmentPatients.remove(number);
        appointmentDoctors.remove(number);
        time.remove(number);
        status.remove(number);
    }

    public static void getAppoint() {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print(" �������: " + appointmentPatients.get(i));
                System.out.print(" ����: " + appointmentDoctors.get(i));
                System.out.print(" ����� ������: " + time.get(i));
                System.out.print(" ������ ������: " + status.get(i) + "\n");
            }
        }
}





