package com.otus.pantikov.dz3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class main {
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/otus";
    private static final String USER = "root";
    private static final String PASSWORD = "qwerty123";

    public static void main(String[] arg) throws SQLException {
        MySQL mySQL = new MySQL();
        //Создание таблиц
        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD)) {
            mySQL.createCuratorTable(connection);
            mySQL.createStudent(connection);
            mySQL.createGroup(connection);
        }
        //Добавление куратора
        mySQL.insertDateIntoCurator("Ivan Vladimirovich");
        mySQL.insertDateIntoCurator("Ivan Petrovich");
        mySQL.insertDateIntoCurator("Pavel Petrovich");
        mySQL.insertDateIntoCurator("Ilya Vladimirovich");
        //Добавление студентов
        mySQL.insertDataIntoStudent("Timothy Wyatt Foster", "M", 1);
        mySQL.insertDataIntoStudent("Christopher Cody Allen", "M", 1);
        mySQL.insertDataIntoStudent("Sebastian Nathan Morgan", "M", 1);
        mySQL.insertDataIntoStudent("Kevin Blake Brooks", "M", 2);
        mySQL.insertDataIntoStudent("Makayla Zoe Campbell", "W", 2);
        mySQL.insertDataIntoStudent("Arianna Elizabeth Morris", "W", 2);
        mySQL.insertDataIntoStudent("Zoe Gabriella Patterson", "W", 2);
        mySQL.insertDataIntoStudent("Nicole Grace Garcia", "W", 3);
        mySQL.insertDataIntoStudent("Michelle Leslie Henderson", "W", 3);
        mySQL.insertDataIntoStudent("Jada Aaliyah Phillips", "W", 3);
        mySQL.insertDataIntoStudent("Connor Antonio Bennett", "M", 3);
        mySQL.insertDataIntoStudent("Adrian Nathan Flores", "M", 1);
        mySQL.insertDataIntoStudent("Jenna Lauren Brooks", "W", 2);
        mySQL.insertDataIntoStudent("Sara Emily Garcia", "W", 3);
        mySQL.insertDataIntoStudent("Jeremiah Anthony Price", "M", 1);
        //Добавление групп
        mySQL.insertDataIntoGroup("Group1", 1);
        mySQL.insertDataIntoGroup("Group2", 2);
        mySQL.insertDataIntoGroup("Group3", 3);
        //Выведение результатов
        try (Connection connection = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD)) {
            mySQL.listStudentGroupCurator(connection);
            mySQL.numberStudents(connection);
            mySQL.femaleStudent(connection);
            mySQL.listGroupCurator(connection);
            mySQL.listStudentGroup(connection);
            mySQL.updateGroupp(connection);
        }
    }
}
