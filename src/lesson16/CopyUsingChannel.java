package lesson16;

import lesson17.CopyUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyUsingChannel implements CopyUtils {
    @Override
    public void copy(String from, String to) {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            try {
                sourceChannel = new FileInputStream(from).getChannel();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                destChannel = new FileOutputStream(to).getChannel();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            try {
                destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }finally{
            try {
                sourceChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                destChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
