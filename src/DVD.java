import java.util.Arrays;

/***
 * Accessing elements in an Array (String Array)
 */
public class DVD {
    public String name;
    public int releaseYear;
    public String director;

    public DVD(String name, int releaseYear, String director) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String toString() {
        return this.name + ", directed by " + this.director + ", released in " + this.releaseYear;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getDvdCollection()));

    }

    //Writing items to an Array
    private static String[] getDvdCollection() {
        DVD[] dvdCollection = new DVD[10];

        DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
        DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
        DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
        DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
        DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");

        dvdCollection[0] = incrediblesDVD;
        dvdCollection[1] = starWarsDVD;
        dvdCollection[2] = avengersDVD;
        dvdCollection[3] = findingDoryDVD;
        dvdCollection[4] = lionKingDVD;

        String[] dvdContentDesc = getItemsByLoop(dvdCollection);
        return dvdContentDesc;
    }

    //Reading Items from an Array with a Loop
    private static String[] getItemsByLoop(DVD[] dvdCollection) {
        String[] dvdContentDesc = new String[10];

        for (int i = 0; i < dvdCollection.length; i++) {
            dvdContentDesc[i] = String.valueOf(dvdCollection[i]);
        }
        return dvdContentDesc;
    }
}
