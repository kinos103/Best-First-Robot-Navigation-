import BufferedReader;
import String;
import FileReader;

public class Main {

    private String filename;

    system.out.println("Please enter ")

    private ArrayList<ArrayList<String>> readMap(String filename){
        ArrayList<ArrayList<String>> tempMap;
        this.filename = filename
        try{
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            ArrayList<String> lineArray;
            while ((line = reader.readLine()) != null)
            {
                lineArray = line.split(",");
                tempMap.add(lineArray);
            }
            reader.close();
            return tempMap;
        }
        catch (Exception e){
            System.err.format("Exception occured trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }


}