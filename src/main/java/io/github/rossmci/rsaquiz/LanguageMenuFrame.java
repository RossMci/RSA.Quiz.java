package io.github.rossmci.rsaquiz;

import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Ross Mcinerney
 */
public class LanguageMenuFrame extends javax.swing.JFrame
{
	private ResourceBundle framesResourceBundle;

	private RsaQuiz rsaQuiz;
	Locale locale=Locale.getDefault();
	Locale enLocale= new Locale("en","EN");
	private QuizFrame quizFrame;
	GregorianCalendar cal = new GregorianCalendar();
	/**
	 * Creates new form OptionsJFrame
	 */
	public LanguageMenuFrame(RsaQuiz rsaQuiz)
	{
		this.enLocale = Locale.getDefault();
		this.rsaQuiz = rsaQuiz;
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", rsaQuiz.getLocale());
		 DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, enLocale);
		initComponents();
		 TimeLabel.setText(formatter.format(cal.getTime()));
	}

	public void reloadLocaleResource()
	{
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", rsaQuiz.getLocale());

		ieToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.ieToggleButton.toolTipText")); // NOI18N
		enToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.enToggleButton.toolTipText")); // NOI18N
		frToggleButton.setToolTipText(framesResourceBundle.getString("LanguageMenu.frToggleButton.toolTipText")); // NOI18N
		titleLabel.setText(framesResourceBundle.getString("LanguageMenu.titleLabel.text")); // NOI18N
		setTitle(framesResourceBundle.getString("LanguageMenu.title")); // NOI18N
		  DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, rsaQuiz.getLocale());
		  TimeLabel.setText(formatter.format(cal.getTime()));
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

        jComboBox1 = new javax.swing.JComboBox<>();
        headingPanel = new javax.swing.JPanel();
        TimeLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        flagPanel = new javax.swing.JPanel();
        frToggleButton = new javax.swing.JToggleButton();
        ieToggleButton = new javax.swing.JToggleButton();
        enToggleButton = new javax.swing.JToggleButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(framesResourceBundle.getString("LanguageMenu.title")); // NOI18N

        headingPanel.setBackground(new java.awt.Color(255, 51, 51));

        TimeLabel.setBackground(new java.awt.Color(255, 255, 255));
        TimeLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("17:00"); // NOI18N

        imageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsa-logo.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText(framesResourceBundle.getString("LanguageMenu.titleLabel.text")); // NOI18N

        javax.swing.GroupLayout headingPanelLayout = new javax.swing.GroupLayout(headingPanel);
        headingPanel.setLayout(headingPanelLayout);
        headingPanelLayout.setHorizontalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headingPanelLayout.setVerticalGroup(
            headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headingPanelLayout.createSequentialGroup()
                .addGroup(headingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headingPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(headingPanelLayout.createSequentialGroup()
                        .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        flagPanel.setBackground(new java.awt.Color(0, 0, 0));

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

        javax.swing.GroupLayout flagPanelLayout = new javax.swing.GroupLayout(flagPanel);
        flagPanel.setLayout(flagPanelLayout);
        flagPanelLayout.setHorizontalGroup(
            flagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flagPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ieToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        flagPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enToggleButton, frToggleButton, ieToggleButton});

        flagPanelLayout.setVerticalGroup(
            flagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(flagPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(flagPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ieToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(frToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(flagPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(flagPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void enToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_enToggleButtonActionPerformed
    {//GEN-HEADEREND:event_enToggleButtonActionPerformed
		this.setVisible(false);
		this.rsaQuiz.setLocale("en");
		this.rsaQuiz.reloadLocaleResource();
		this.rsaQuiz.getQuizFrame().setVisible(true);
    }//GEN-LAST:event_enToggleButtonActionPerformed

    private void ieToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ieToggleButtonActionPerformed
    {//GEN-HEADEREND:event_ieToggleButtonActionPerformed
		this.setVisible(false);
		this.rsaQuiz.setLocale("ie");
		this.rsaQuiz.reloadLocaleResource();
		this.rsaQuiz.getQuizFrame().setVisible(true);
		this.rsaQuiz.getQuizFrame().setLocale(rsaQuiz.getLocale());
    }//GEN-LAST:event_ieToggleButtonActionPerformed

    private void frToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_frToggleButtonActionPerformed
    {//GEN-HEADEREND:event_frToggleButtonActionPerformed
		this.setVisible(false);
		this.rsaQuiz.setLocale("fr");
		this.rsaQuiz.reloadLocaleResource();
		this.rsaQuiz.getQuizFrame().setVisible(true);
		this.rsaQuiz.getQuizFrame().setLocale(rsaQuiz.getLocale());
    }//GEN-LAST:event_frToggleButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JToggleButton enToggleButton;
    private javax.swing.JPanel flagPanel;
    private javax.swing.JToggleButton frToggleButton;
    private javax.swing.JPanel headingPanel;
    private javax.swing.JToggleButton ieToggleButton;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
