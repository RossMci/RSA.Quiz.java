package io.github.rossmci.rsaquiz;

import java.util.ResourceBundle;

/**
 *
 * @author Ross Mcinerney
 */
public class LanguagePanel extends RsaQuizPanel
{

	public LanguagePanel()
	{
		initComponents();
	}

	@Override
	public void reloadLocaleResource()
	{
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", this.getRsaQuizManger().getLocale());

		ieToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.ieToggleButton.toolTipText")); // NOI18N
		enToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.enToggleButton.toolTipText")); // NOI18N
		frToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.frToggleButton.toolTipText")); // NOI18N
	}

	private void changeAppLocale(String locale)
	{
		this.setVisible(false);
		this.getRsaQuizManger().setLocale(locale);
		this.getRsaQuizManger().reloadLocaleResource();
		this.getRsaQuizManger().setQuizVisible(true);
	}

	/**
	 * /**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        frToggleButton = new javax.swing.JToggleButton();
        ieToggleButton = new javax.swing.JToggleButton();
        enToggleButton = new javax.swing.JToggleButton();

        frToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flags/fr.png"))); // NOI18N
        frToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.frToggleButton.toolTipText")); // NOI18N
        frToggleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                frToggleButtonActionPerformed(evt);
            }
        });

        ieToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flags/ie.png"))); // NOI18N
        ieToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.ieToggleButton.toolTipText")); // NOI18N
        ieToggleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                ieToggleButtonActionPerformed(evt);
            }
        });

        enToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flags/en.png"))); // NOI18N
        enToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.enToggleButton.toolTipText")); // NOI18N
        enToggleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                enToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ieToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enToggleButton, frToggleButton, ieToggleButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ieToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void frToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frToggleButtonActionPerformed
    {//GEN-HEADEREND:event_frToggleButtonActionPerformed
		changeAppLocale("fr");
    }//GEN-LAST:event_frToggleButtonActionPerformed


    private void ieToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ieToggleButtonActionPerformed
    {//GEN-HEADEREND:event_ieToggleButtonActionPerformed
		changeAppLocale("ie");
    }//GEN-LAST:event_ieToggleButtonActionPerformed

    private void enToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_enToggleButtonActionPerformed
    {//GEN-HEADEREND:event_enToggleButtonActionPerformed
		changeAppLocale("en");
    }//GEN-LAST:event_enToggleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton enToggleButton;
    private javax.swing.JToggleButton frToggleButton;
    private javax.swing.JToggleButton ieToggleButton;
    // End of variables declaration//GEN-END:variables
}
