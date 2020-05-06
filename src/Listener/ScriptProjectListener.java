package Listener;

import GUI.GUI;
import ProjectViewer.ProjectViewer;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.*;

public class ScriptProjectListener implements ListSelectionListener {
    @Override
    public void valueChanged(ListSelectionEvent e) {
        String path= ProjectViewer.scriptString+"\\"+ GUI.pvv6.elementAt(GUI.pvl6.getSelectedIndex()).toString();
        File file=new File(path);
        StringBuilder result = new StringBuilder();
        BufferedReader bf= null;
        System.out.println(path);
        try {
            bf = new BufferedReader(new FileReader(file));
            String s;
            BufferedReader bf1=new BufferedReader(new FileReader(file));
            String s1;
            while((s1 = bf1.readLine())!=null){
                result.append(System.lineSeparator()+s1);
            }
            bf.close();
            GUI.jt1.setText(result.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
