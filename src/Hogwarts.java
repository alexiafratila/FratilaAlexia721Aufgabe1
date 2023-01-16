import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Hogwarts {
    int id;
    List<String> StudentList;
    String Autoritat;
    int Punkt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<String> studentList) {
        StudentList = studentList;
    }

    public String getAutoritat() {
        return Autoritat;
    }

    public void setAutoritat(String autoritat) {
        Autoritat = autoritat;
    }

    public int getPunkt() {
        return Punkt;
    }

    public void setPunkt(int punkt) {
        Punkt = punkt;
    }

    public void readFromFile() {
    //lesen das Text Datei
    try {
        FileReader fr = new FileReader("punkte.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] fields = line.split("&");
            String house = fields[0];
            int points = Integer.parseInt(fields[1]);
        }
    }
    catch(IOException e) {

        }
    }

    public void filterByLetter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write the first letter: ");
        String letter = input.nextLine();

        for (String s: StudentList)
            if (s.startsWith(letter))
                System.out.println(s);
    }



}

