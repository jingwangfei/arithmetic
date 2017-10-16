package java_knowledge.nio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * ${DESCRIPTION}
 *
 * @Author jingtao
 * @Date 2017-09-13 11:17
 **/
public class NIOTest {

    public static void main(String[] args) {


        try {
            FileInputStream inputStream = new FileInputStream("");


            FileChannel channel = inputStream.getChannel();

//            channel.
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            channel.read(byteBuffer);


            inputStream.read();

            FileOutputStream outputStream = new FileOutputStream("");
            outputStream.write(1);

            //
            FileReader fileReader = new FileReader("");
            fileReader.read();

            //
            FileWriter fileWriter = new FileWriter("");
            fileWriter.write("");




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
