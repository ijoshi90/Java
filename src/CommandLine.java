/*
Author : Akshay Joshi
GitHub : https://github.com/ijoshi90
Created on 01-01-2020 at 17:13
*/

import java.io.*;

public class CommandLine {

    public static void main(String[] args) throws IOException {
        //try if length is < 10
        try {
            if (args.length < 10)
                throw new InsufficientAgruments();
        } catch (InsufficientAgruments e) {
            System.out.println(e);
        }

        File f = new File("NumberFile.txt");//create NumberFile (if it doesn't exist)
        FileOutputStream fos;
        //check if the file exists or not
        if (f.exists()) {
            fos = new FileOutputStream("NumberFile.txt", true);
        } else//if not create it
            fos = new FileOutputStream("NumberFile.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        for (int i = 0; i < 10; i++)
            dos.writeUTF(args[i]);
        fos.close();

        //DataInputStream to read data from the file
        DataInputStream dis = new DataInputStream(new FileInputStream("NumberFile.txt"));
        try {
            while (true)
                System.out.println(dis.readUTF());
        } catch (EOFException e) {
            System.out.println(e.toString());
        }
        dis.close();
    }
}