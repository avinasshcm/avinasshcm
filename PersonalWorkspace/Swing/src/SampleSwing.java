import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SampleSwing {

    public static void main(String[] args) {
        JFrame f = new JFrame();// creating instance of JFrame
        JComboBox<String> modules = new JComboBox<String>();
        JComboBox<String> version = new JComboBox<String>();
        final JTextField tf = new JTextField();
        tf.setBounds(130, 120, 150, 20);
        String module = "";
        List<String> mod = printAllPathsInFolder("Z:\\");
        for (String s : mod) {
            modules.addItem(s);
        }
        modules.setBounds(130, 50, 100, 20);

        modules.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tf.setText(modules.getItemAt(modules.getSelectedIndex()));
                version.removeAllItems();
                for (String ver : fetchVersions("Z:\\" + tf.getText())) {
                    version.addItem(ver);
                }
            }
        });

        version.setBounds(130, 200, 100, 20);
        JButton b = new JButton("click");// creating instance of JButton
        b.setBounds(130, 150, 100, 20);// x axis, y axis, width, height

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // tf.setText("Welcome to Javatpoint.");
                

            }
        });

        f.add(modules);
        f.add(b);// adding button in JFrame
        f.add(tf);
        f.add(version);
        f.setSize(1024, 768);// 400 width and 500 height
        f.setLayout(null);// using no layout managers
        f.setVisible(true);// making the frame visible
    }

    public static void printAllPaths(Stream<Path> paths) {
        paths.forEach(System.out::println);
    }

    public static List<String> printAllPathsInFolder(String folder) {
        List<String> modules = new ArrayList<String>();
        try (Stream<Path> paths = Files.list(Paths.get(folder))) {
            // printAllPaths(paths);
            modules = paths.map(e -> e.toString().replace("Z:\\", "")).collect(Collectors.toList());

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe);
        }
        return modules;
    }

    public static List<String> fetchVersions(String folder) {

        List<String> versions = new ArrayList<String>();
        try (Stream<Path> paths = Files.list(Paths.get(folder + "\\DailyBuilds\\"))) {
            // printAllPaths(paths);
            versions = paths.map(e -> e.toString().replace(folder + "\\DailyBuilds\\", "")).collect(Collectors.toList());

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe);
        }
        return versions;
    }
}
