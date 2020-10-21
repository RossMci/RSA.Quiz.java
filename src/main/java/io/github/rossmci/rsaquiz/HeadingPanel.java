/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci.rsaquiz;

import io.github.rossmci.rsaquiz.old.RsaQuiz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.ResourceBundle;
import javax.swing.Timer;

/**
 *
 * @author Ross Mcinerney
 */
public class HeadingPanel extends javax.swing.JPanel
{
	
	public void clock(){
	Timer t = new Timer(1000, updateClockAction);
	t.start ();
	
}
	
	ActionListener updateClockAction = new ActionListener() {
  @Override
  public void actionPerformed(ActionEvent e) {
    timeDisplayLabel.setText(new Date().toString()); 
    }
};

	/**
	 * Creates new form HeadingPanel
	 */
	
	public HeadingPanel()
	{
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames");
		initComponents();
		clock();
	}
	public HeadingPanel(RsaQuiz rsaQuiz)
	{
		this.rsaQuiz = rsaQuiz;
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", rsaQuiz.getLocale());
		initComponents();
				clock();
	}
	public RsaQuiz getRsaQuiz()
	{
		return rsaQuiz;
	}
	public void setRsaQuiz(RsaQuiz rsaQuiz)
	{
		this.rsaQuiz = rsaQuiz;
	}

	public void reloadLocaleResource()
	{
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", rsaQuiz.getLocale());
 		
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private ResourceBundle framesResourceBundle;
	private  RsaQuiz rsaQuiz;

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        optionsjButton = new javax.swing.JButton();
        imagelabel = new javax.swing.JLabel();
        timeDisplayLabel = new javax.swing.JLabel();
        dateDisplayLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));

        optionsjButton.setText("Options");
        optionsjButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                optionsjButtonActionPerformed(evt);
            }
        });

        imagelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsa-logo.png"))); // NOI18N

        timeDisplayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeDisplayLabel.setText("timeDisplay");

        dateDisplayLabel.setText("dateDisplayLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(imagelabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateDisplayLabel)
                    .addComponent(timeDisplayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(optionsjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(timeDisplayLabel)
                        .addGap(3, 3, 3)
                        .addComponent(dateDisplayLabel))
                    .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optionsjButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_optionsjButtonActionPerformed
    {//GEN-HEADEREND:event_optionsjButtonActionPerformed

    }//GEN-LAST:event_optionsjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateDisplayLabel;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JButton optionsjButton;
    private javax.swing.JLabel timeDisplayLabel;
    // End of variables declaration//GEN-END:variables
}