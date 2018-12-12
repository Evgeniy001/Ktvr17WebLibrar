/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;


import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ReaderCreator {
    public Reader returnNewReader(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("-----Добавление нового читателя-----");
        Reader reader = new Reader();
        System.out.println("Имя:");
        reader.setName(scanner.nextLine());
        System.out.println("Фамилия:");
        reader.setSurname(scanner.nextLine());
        System.out.println("Телефон:");
        reader.setPhone(scanner.nextLine());
        System.out.println("Город:");
        reader.setCity(scanner.nextLine());
        return reader;
    }
}
