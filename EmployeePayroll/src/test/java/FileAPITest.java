import org.junit.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class FileAPITest {
    private static String BASE = System.getProperty("user.home");
    private static String PLAY_WITH_FILES = "Temp_Files";
    @Test
    public void givenPathWhenCheckedThenConfirm() throws IOException{
        //Check if file exists
        Path basePath = Paths.get(BASE);
        Assert.assertTrue(Files.exists(basePath));
        //Delete file and check if it exists
        Path playPath = Paths.get(BASE+"/"+PLAY_WITH_FILES);
        File f = new File(playPath+"\\OOO");
        if (f.exists())
        {
            f.delete();
        }
        Assert.assertFalse(f.exists());
        //Create a directory and check if it exists
        Files.createDirectory(playPath);
        Assert.assertTrue(Files.exists(playPath));
        //Create Empty File
        IntStream.range(1,10).forEach(cntr->{
            Path tempFile = Paths.get(playPath+"/temp"+cntr);
            Assert.assertTrue(Files.notExists(tempFile));
            try {
                Files.createFile(tempFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Assert.assertTrue(Files.exists(tempFile));
        });
        //List Files, Directories as well as Files with Extension
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        Files.newDirectoryStream(playPath,path->path.toFile().isFile() && path.toString().startsWith("temp")).forEach(System.out::println);
    }
}
