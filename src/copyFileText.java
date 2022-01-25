import java.io.*;

public class copyFileText {
    public void copyFile( String filePath) {
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String line = "";
            FileWriter writer = new FileWriter( "copy_"+filePath , true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            while ((line = br.readLine()) != null) {
                bufferedWriter.write(line +"\n");
            }
            bufferedWriter.close();
            br.close();
            System.out.println("Đã copy Xong");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
