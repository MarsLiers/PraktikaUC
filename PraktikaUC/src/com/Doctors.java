package com;



public class Doctors extends Act{


    public static void setDoctors() {
        System.out.print("Напишите ФИО врача: ");
        String name = s.nextLine();
        doctors.add(name);
    }

    public static String getDoctors() {
            for(int i = 0; i < doctors.size(); i++) {
                System.out.print("ФИО врача: " + doctors.get(i) + "\n");
        }
        return "Operation completed";
    }

    public static void removeDoctors() {
        getDoctors();
        System.out.print("Напишите номер врача, начиная с 0, для удаления: ");
        int number = s.nextInt();
        doctors.remove(number);
        }
    }




