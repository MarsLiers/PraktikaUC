package com;

import java.util.ArrayList;


public class AppData extends Act {
    private static final ArrayList<String> appointmentPatients = new ArrayList<>();
    private static final ArrayList<String> appointmentDoctors = new ArrayList<>();
    private static final ArrayList<String> time = new ArrayList<>();
    protected static final ArrayList<String> status = new ArrayList<>();

    public static void setAppoint() {
        System.out.println(Patients.getPatients());
        System.out.print("Введите фио пациента для записи: ");
        String name = s.nextLine();
        System.out.println(Doctors.getDoctors());
        System.out.print("Введите фио доктора для записи: ");
        String name1 = s.nextLine();
        System.out.print("Введите время записи на прием в формате \"dd-MM HH:mm\": ");
        String time1 = s.nextLine();
        time1 = s.nextLine();
        appointmentPatients.add(name);
        appointmentDoctors.add(name1);
        time.add(time1);
        status.add("Новый");
    }



    public static void changeAppoint() {
        getAppoint();
        System.out.print("Напишите номер приема по счету, начиная с 0, статус которого хотите изменить: ");
        int number = s.nextInt();
        System.out.println("Список статусов: новый, в процессе, отменен, ожидает оплаты, завершен");
        System.out.print("Выберете и напишите статус в след строку для изменения: ");
        String status1 = s.nextLine();
        status.set(number,status1);
        }


    public static void removeAppoint() {
        getAppoint();
        System.out.print("Напишите номер приема по счету, начиная с 0, для удаления: ");
        int number = s.nextInt();
        appointmentPatients.remove(number);
        appointmentDoctors.remove(number);
        time.remove(number);
        status.remove(number);
    }

    public static void getAppoint() {
            for (int i = 0; i < appointmentPatients.size(); i++) {
                System.out.print(" Пациент: " + appointmentPatients.get(i));
                System.out.print(" Врач: " + appointmentDoctors.get(i));
                System.out.print(" Время приема: " + time.get(i));
                System.out.print(" Статус приема: " + status.get(i) + "\n");
            }
        }
}





