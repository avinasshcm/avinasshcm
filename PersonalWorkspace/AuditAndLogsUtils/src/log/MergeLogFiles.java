package log;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeLogFiles {
	public static void main(String args[]) {
		System.out.println("Start");
		String FilePath = "C:\\Users\\amanjuna\\Desktop\\07-06-2017\\FBELogs_20170607181333\\server1\\SysOut\\";
		String findString = "FBE_CBS_PRNSVC";
		Path path = Paths.get(FilePath);
		List<String> consolidated = new ArrayList<String>();
		try {
			List<Path> files = Files.list(path).collect(Collectors.toList());
			for (Path item : files) {
				consolidated.addAll(Files.lines(item).filter(e -> e.contains(findString)).distinct().collect(Collectors.toList()));
			}
			consolidated = consolidated.stream().sorted().collect(Collectors.toList());
			Files.write(Paths.get(FilePath + findString + "_Consolidated.txt"), consolidated, Charset.defaultCharset());
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
