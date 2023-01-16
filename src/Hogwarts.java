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

    public static void readFromFile() {
        try {
            FileReader fr = new FileReader("punkte.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split("&");
                String house = fields[0];
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public void filterByLetter() {
        //wir lesen von Tastatur eine Buchstabe
        Scanner input = new Scanner(System.in);
        System.out.println("Write the first letter: ");
        String letter = input.nextLine();

        for (String s: StudentList)
            if (s.startsWith(letter)) //suchen alle Namen die mit die "letter" beginnen
                System.out.println(s); //zeigt alle Name an
    }

//    public void sortAlphabetic() {
//        List<String> gryffindorStudent = new ArrayList<>(); //eine neue Liste um die Studenten aus Gryffindor memorieren
//        for (StudentList s: StudentList)
//            if (s.getHouse().equals("Gryffindor")) //suchen ob das Haus Gryffindor ist
//                gryffindorStudent.add(s.getName());
//        Collections.sort(gryffindorStudent); //sortieren die Name alphabetisch
//        for (String s: gryffindorStudent)
//            System.out.println(s + "\n"); //zeigen alle Namen an
//    }

}

