package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {


        try {
            FileReader fileReader = new FileReader ("src/main/resources/DataFiles/employees.csv");

            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            while ((input =bufReader.readLine()) !=null) {
                String[] inputSplit = input.split("\\|");

                String employeeId = Arrays.toString(inputSplit[1].split(Pattern.quote("|")));
                String name = Arrays.toString(inputSplit[2].split(Pattern.quote("|")));
                double hoursWorked = Double.parseDouble(String.valueOf(Arrays.toString(inputSplit[3].split(Pattern.quote("|")))));
                double payRate = Double.parseDouble(String.valueOf(Arrays.toString(inputSplit[4].split(Pattern.quote("|")))));

                String[] employee = input.split("\\|");

                Payroll emp = new Payroll(employeeId, name, hoursWorked, payRate);

                int id = Integer.parseInt(emp.getEmployeeId());

                String Name = emp.getName();

                double grossPay = Double.parseDouble(emp.getGrossPay());

                System.out.printf("ID: %d, Name: %s, Gross Pay: $%.2f\n", emp.getEmployeeId(), emp.getName(), emp.getGrossPay());
            }

            bufReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
