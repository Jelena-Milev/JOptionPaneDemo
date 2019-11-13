/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.forms.optionDialogs;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author IRC_client
 */
public class FDialogOption extends javax.swing.JFrame {

    /**
     * Creates new form FDialogOption
     */
    public FDialogOption() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLblNoButtonClicked = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLblNoButtonClicked1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Option Dialog");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Option dijalog je najopštiji tip dijaloga čiji svi elementi se mogu kastomizovati.");

        jLabel2.setText("Izabrano dugme:");

        jButton2.setText("Option Dialog 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Izabrano dugme:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLblNoButtonClicked1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 138, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jLblNoButtonClicked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2)
                    .addComponent(jLblNoButtonClicked, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel3)
                    .addComponent(jLblNoButtonClicked1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//      Metoda showOptionDialog omogucava definisanje svih elemenata dijalog; 
//      parametrima metode se redom definisu: roditeljska forma, poruka i naslov dijaloga,
//      predefinisana grupa dugmica koje korisnik moze da selektuje, 
//      vrsta poruke kojom se postavlja neka od predefinisanih ikonica na dijalog,
//      konkretna ikonica po zelji (umesto neke od predefinisanih), 
//      niz opcija koje ce biti prikazane na dugmicima koje korisnik moze da selektuje (umesto predefinisane grupe dugmica),
//      indeks dugmica koji ce biti fokusiran kada se dijalog prikaze 

//      Napomena: Povratna vrednost metode showOptionDialog je redni broj izabranog dugmeta (pocevsi od 0)
//      Ukoliko korisnik samo zatvori dijalog, a pritom ne izabere nijednu opciju, metoda ce vratiti -1  
        String[] options = {"prva", "druga", "treca", "cetvrta", "peta"};
        int buttonClicked = JOptionPane.showOptionDialog(null, "Message option dijaloga", "Naslov option dijaloga", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[3]);
         if (buttonClicked == -1) {
            jLblNoButtonClicked.setText("Dijalog je zatvoren, nijedna opcija nije izabrana");
        } else {
            jLblNoButtonClicked.setText(buttonClicked + ": " + options[buttonClicked]);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//      kako je parametar options tipa Object[] mozemo proslediti niz objekata bilo koje klase
//      kao niz opcija koje ce biti prikazane na dugmicima koje korisnik moze da selektuje (umesto predefinisane grupe dugmica),
//      kada prosledimo niz ikonica svaka se smesti na po jedno dugme  
        ImageIcon java = new ImageIcon("src/resources/java.png");
        ImageIcon java2 = new ImageIcon("src/resources/java2.png");
        ImageIcon linux = new ImageIcon("src/resources/linux.png");
        ImageIcon[] options = {java, java2, linux};
        int buttonClicked = JOptionPane.showOptionDialog(null, "Message option dijaloga", "Naslov option dijaloga", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
       
//      Napomena: Ukoliko korisnik samo zatvori dijalog a pritom ne izabere nijednu opciju, metoda showOptionDialog ce vratiti -1  

        if (buttonClicked == -1) {
            jLblNoButtonClicked1.setText("Dijalog je zatvoren, nijedna opcija nije izabrana");
        } else {
            jLblNoButtonClicked1.setText(buttonClicked + "");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLblNoButtonClicked;
    private javax.swing.JLabel jLblNoButtonClicked1;
    // End of variables declaration//GEN-END:variables
}
