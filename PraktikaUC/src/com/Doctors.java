package com;



public class Doctors extends Act{


    public static void setDoctors() {
        System.out.print("�������� ��� �����: ");
        String name = s.nextLine();
        doctors.add(name);
    }

    public static String getDoctors() {
            for(int i = 0; i < doctors.size(); i++) {
                System.out.print("��� �����: " + doctors.get(i) + "\n");
        }
        return "Operation completed";
    }

    public static void removeDoctors() {
        getDoctors();
        System.out.print("�������� ����� �����, ������� � 0, ��� ��������: ");
        int number = s.nextInt();
        doctors.remove(number);
        }
    }




