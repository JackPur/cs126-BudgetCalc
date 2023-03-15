import java.io.*;

public class FileEditor {

//Method to create a new file
public void createFile(String fileName) throws IOException{
    File file = new File(fileName);
    if(!file.exists()){
        file.createNewFile();
    }
}

//Method to store floats in a file
public void storeFloats(String fileName, float[] floats) throws IOException{
    FileOutputStream fos = new FileOutputStream(fileName);
    DataOutputStream dos = new DataOutputStream(fos);
    for(float f : floats){
        dos.writeFloat(f);
    }
    dos.close();
}

//Method to access floats from a file
public float[] accessFloats(String fileName) throws IOException{
    FileInputStream fis = new FileInputStream(fileName);
    DataInputStream dis = new DataInputStream(fis);
    float[] floats = new float[dis.available()/4];
    int count = 0;
    while(dis.available() > 0){
        floats[count++] = dis.readFloat();
    }
    dis.close();
    return floats;
}

}