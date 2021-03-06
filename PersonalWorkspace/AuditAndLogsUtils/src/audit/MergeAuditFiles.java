package audit;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MergeAuditFiles {
	public static void main(String args[]) {
		System.out.println("Start");
		String findString = "WebContainer : 97";
		String FilePath = "C:\\Users\\amanjuna\\Desktop\\Belize_HL_Imbal\\01850062_HoldingLocationImbalance\\SFDC\\Profile1Audit\\audit-20170802202756\\Orig\\";
		Path path = Paths.get(FilePath);
		String outputFile = FilePath + "97WC" + "_User_Consolidated_sorted.txt";
		List<String> consolidated = new ArrayList<String>();
		try {
			List<Path> files = Files.list(path).collect(Collectors.toList());
			for (Path item : files) {
				consolidated.addAll(Files.lines(item).filter(word -> word.contains(findString)).collect(Collectors.toList()));
			}
			//consolidated = consolidated.stream().filter(word -> word.contains("BT_VCB_HoldingLocationTotal")).sorted().collect(Collectors.toList());
			consolidated = consolidated.stream().distinct().sorted().collect(Collectors.toList());
			Files.write(Paths.get(outputFile), consolidated, Charset.defaultCharset(), StandardOpenOption.CREATE);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
}
