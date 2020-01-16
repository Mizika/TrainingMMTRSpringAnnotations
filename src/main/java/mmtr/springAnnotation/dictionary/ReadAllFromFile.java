package mmtr.springAnnotation.dictionary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Component("readFromFile")
public class ReadAllFromFile {
    private static String path;
    private static DictionarySelection dictionarySelection;

    @Value("C:\\SpringAnnotationsDictionary\\dictionaries")
    public void setPath(String path) {
        ReadAllFromFile.path = path;
    }
    public static String getPath() {
        return path;
    }

    @Autowired
    public void setDictionarySelection(DictionarySelection dictionarySelection) {
        this.dictionarySelection = dictionarySelection;
    }

    public static DictionarySelection getDictionarySelection() {
        return dictionarySelection;
    }

    public static List<String> readAllFromFile() {
        File file = new File(getPath() + "\\"+ getDictionarySelection());
        List<String> listResult = new ArrayList<>();
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()) {
                listResult.add(sc.nextLine());
            }
        }catch (Exception err){
            err.printStackTrace();
        }
        return listResult;
    }
}
