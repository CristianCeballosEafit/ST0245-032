package proyecto;

import java.awt.Graphics;
import java.text.MessageFormat;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
        List<String> myCollisions = main.popo();

//        System.out.println("####################");
        for (String col : myCollisions) {
            System.out.println(col);
            jTextArea1.append(col);

        }

        for (String poo : QuadTree.choques) {
            //String format = "Popo1: " + col.getFirst().getX() + " - " +   col.getFirst().getX();
            System.out.println(poo + "\r\n");
            jTextArea1.append(poo + "\r\n");
        }

        jScrollPane1.add(new MyPanel());
        jScrollPane1.setVisible(true);
        jScrollPane1.repaint();

        jScrollPane2.add(new MyPanel());
        jScrollPane2.setVisible(true);
        jScrollPane2.repaint();

//        System.out.println("#############");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane1.add(new MyPanel());
        MyPanel myPanel = new MyPanel();
        jScrollPane1.add(myPanel);
        jScrollPane1.setViewportView(myPanel);
        jScrollPane1.setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JList<String> n = new JList<>();

    public static void main(String args[]) {

        JOptionPane.showMessageDialog(null, "Comencemos");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new JScrollPane().setVisible(true);
                new interfaz().setVisible(true);

            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
