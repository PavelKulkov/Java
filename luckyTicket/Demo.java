package com.kulkov.luckyTicket;

import java.io.*;
import java.util.ArrayList;
/**
 * Класс для определения "счастливых" билетов.
 * Номера билетов считываются из файла Input.txt
 * Номера "счастливых" билетов записываются в файл Output.txt
 *
 * @author Pavel Kulkov, группа 12оит18к
 */

public class Demo {
    public static void main(String[] args) throws Exception {
        try {
            //Получаем номера всех билетов
            ArrayList <String> tickets = new ArrayList<String>(getTicketsFromFile("Input.txt"));
            //Получаем номера счастливых билетов
            ArrayList <String> luckyTickets = new ArrayList<>(getLuckyTickets(tickets));
            //Записываем номера счастливых билетов в файл
            writeInFile("Output.txt",luckyTickets);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Метод для чтения данных из файла
     *
     * @param FilePath Путь к файлу
     * @return Массив, содержащий номера всех билетов
     * @throws IOException ошибка ввода/вывода данных
     */
    public static ArrayList <String> getTicketsFromFile(String FilePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(FilePath));

        ArrayList<String> tickets = new ArrayList<String>();
        String line;
        while((line = reader.readLine()) != null){
            tickets.add(line);
        }
        reader.close();
        return tickets;
    }

    /**
     * Метод для определения "счастливых" билетов
     *
     * @param tickets Массив, содержащий номера всех билетов
     * @return Массив, содержащий номера счастливых билетов
     */
    public static ArrayList<String> getLuckyTickets(ArrayList<String> tickets){
        ArrayList<String> luckyTickets = new ArrayList<>();
        for(int i=0;i<tickets.size();i++){
            if(tickets.get(i).substring(0, 2).equals(tickets.get(i).substring(3, 5))){
                luckyTickets.add(tickets.get(i));
            }
        }
        return luckyTickets;
    }

    /**
     * Метод для записи "счастливых билетов" в файл
     *
     * @param FilePath Путь к файлу
     * @param luckyTickets Массив, содержащий номера счастливых билетов
     * @throws IOException ошибка ввода/вывода данных
     */
    public static void writeInFile(String FilePath, ArrayList luckyTickets) throws IOException {
        FileWriter fileWriter = new FileWriter(FilePath);
        for(int i=0;i<luckyTickets.size();i++){
            fileWriter.write(luckyTickets.get(i)+"\n");
        }
        fileWriter.close();
    }
}
