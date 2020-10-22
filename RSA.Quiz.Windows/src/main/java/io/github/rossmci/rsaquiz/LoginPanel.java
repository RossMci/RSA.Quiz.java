/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.rossmci.rsaquiz;

/**
 *
 * @author Ross Mcinerney
 */
public class LoginPanel extends RsaQuizPanel
{

	/**
	 * Creates new form LoginPanel
	 */
	public LoginPanel()
	{
		initComponents();
	}

	@Override
	public void reloadLocaleResource()
	{
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        UserLoginjLabel = new javax.swing.JLabel();
        userNamejTextField = new javax.swing.JTextField();
        userNamejLabel = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        passwordjLabel = new javax.swing.JLabel();
        submitjButton = new javax.swing.JButton();

        UserLoginjLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UserLoginjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UserLoginjLabel.setText("User Login");

        userNamejLabel.setText("Username");

        passwordjLabel.setText("Password");

        submitjButton.setText("Submit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordjLabel)
                    .addComponent(userNamejLabel)
                    .addComponent(UserLoginjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(userNamejTextField)
                    .addComponent(passwordjTextField)
                    .addComponent(submitjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(UserLoginjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(userNamejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordjLabel)
                .addGap(2, 2, 2)
                .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(submitjButton)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLoginjLabel;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JButton submitjButton;
    private javax.swing.JLabel userNamejLabel;
    private javax.swing.JTextField userNamejTextField;
    // End of variables declaration//GEN-END:variables

}