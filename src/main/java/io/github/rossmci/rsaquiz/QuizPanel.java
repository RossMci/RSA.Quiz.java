package io.github.rossmci.rsaquiz;

import java.util.ResourceBundle;

public class QuizPanel extends RsaQuizPanel
{


	public QuizPanel()
	{
		initComponents();
	}


	
	@Override
	public void reloadLocaleResource()
	{
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", this.getRsaQuizManger().getLocale());
        optionsToggleButton.setText(framesResourceBundle.getString("QuizFrame.optionsToggleButton.text")); // NOI18N
        StartToggleButton.setText(framesResourceBundle.getString("QuizFrame.startToggleButton.text")); // NOI18N
        InstructionLabel.setText(framesResourceBundle.getString("QuizFrame.instructionLabel.text")); // NOI18N
		
		//TODO:this.TimeLabel.setText(date.tosTring(rsaQuiz.getLocale()));
//	      DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, rsaQuiz.getLocale());
//		  TimeLabel.setText(formatter.format(cal.getTime()));
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

        mainPanel = new javax.swing.JPanel();
        imagelabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        PictureQuestionPanel = new javax.swing.JPanel();
        pic3Button = new javax.swing.JToggleButton();
        pic1ToggleButton = new javax.swing.JToggleButton();
        pic2ToggleButton = new javax.swing.JToggleButton();
        InstructionLabel = new javax.swing.JLabel();
        QuestionLabel = new javax.swing.JLabel();
        SymbolLabel = new javax.swing.JLabel();
        MaxLabel = new javax.swing.JLabel();
        counterLabel = new javax.swing.JLabel();
        StartToggleButton = new javax.swing.JToggleButton();
        optionsToggleButton = new javax.swing.JToggleButton();

        mainPanel.setBackground(new java.awt.Color(255, 51, 51));

        imagelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rsa-logo.png"))); // NOI18N

        TimeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimeLabel.setText("17:00"); // NOI18N

        PictureQuestionPanel.setBackground(new java.awt.Color(255, 255, 255));
        PictureQuestionPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(255, 51, 51)));

        pic3Button.setBackground(new java.awt.Color(255, 255, 255));
        pic3Button.setForeground(new java.awt.Color(255, 255, 255));
        pic3Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signs/info_signs/Airport.gif"))); // NOI18N
        pic3Button.setBorder(null);

        pic1ToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        pic1ToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        pic1ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signs/tourist_signs/Oige youth hostels.gif"))); // NOI18N
        pic1ToggleButton.setBorder(null);

        pic2ToggleButton.setBackground(new java.awt.Color(255, 255, 255));
        pic2ToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        pic2ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/signs/regulatory_signs/Bus only street.gif"))); // NOI18N
        pic2ToggleButton.setBorder(null);

        InstructionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        InstructionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InstructionLabel.setText(framesResourceBundle.getString("QuizFrame.instructionLabel.text")); // NOI18N

        javax.swing.GroupLayout PictureQuestionPanelLayout = new javax.swing.GroupLayout(PictureQuestionPanel);
        PictureQuestionPanel.setLayout(PictureQuestionPanelLayout);
        PictureQuestionPanelLayout.setHorizontalGroup(
            PictureQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PictureQuestionPanelLayout.createSequentialGroup()
                .addComponent(pic1ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(pic2ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pic3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(InstructionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PictureQuestionPanelLayout.setVerticalGroup(
            PictureQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PictureQuestionPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(InstructionLabel)
                .addGap(0, 0, 0)
                .addGroup(PictureQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PictureQuestionPanelLayout.createSequentialGroup()
                        .addGroup(PictureQuestionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pic2ToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pic1ToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addComponent(pic3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        QuestionLabel.setBackground(new java.awt.Color(255, 51, 51));
        QuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuestionLabel.setText("Test Question");

        SymbolLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SymbolLabel.setForeground(new java.awt.Color(255, 255, 255));
        SymbolLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SymbolLabel.setText("/"); // NOI18N

        MaxLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MaxLabel.setForeground(new java.awt.Color(255, 255, 255));
        MaxLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MaxLabel.setText("20"); // NOI18N

        counterLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        counterLabel.setForeground(new java.awt.Color(255, 255, 255));
        counterLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        counterLabel.setText("1"); // NOI18N

        StartToggleButton.setBackground(new java.awt.Color(0, 0, 0));
        StartToggleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        StartToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        StartToggleButton.setText(framesResourceBundle.getString("QuizFrame.startToggleButton.text")); // NOI18N
        StartToggleButton.setBorder(null);
        StartToggleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                StartToggleButtonActionPerformed(evt);
            }
        });

        optionsToggleButton.setBackground(new java.awt.Color(0, 0, 0));
        optionsToggleButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        optionsToggleButton.setForeground(new java.awt.Color(255, 255, 255));
        optionsToggleButton.setText(framesResourceBundle.getString("QuizFrame.optionsToggleButton.text")); // NOI18N
        optionsToggleButton.setBorder(null);
        optionsToggleButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                optionsToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PictureQuestionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(QuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(StartToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(counterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SymbolLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MaxLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optionsToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(TimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TimeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(PictureQuestionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(QuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optionsToggleButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SymbolLabel)
                                .addComponent(MaxLabel)
                                .addComponent(counterLabel))
                            .addComponent(StartToggleButton))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void StartToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_StartToggleButtonActionPerformed
    {//GEN-HEADEREND:event_StartToggleButtonActionPerformed
		// TODO add your handling code here:
    }//GEN-LAST:event_StartToggleButtonActionPerformed

    private void optionsToggleButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_optionsToggleButtonActionPerformed
    {//GEN-HEADEREND:event_optionsToggleButtonActionPerformed
		this.getRsaQuizManger().setLanguageMenuVisible(true);
		this.setVisible(false);
    }//GEN-LAST:event_optionsToggleButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel InstructionLabel;
    private javax.swing.JLabel MaxLabel;
    private javax.swing.JPanel PictureQuestionPanel;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JToggleButton StartToggleButton;
    private javax.swing.JLabel SymbolLabel;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel counterLabel;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JToggleButton optionsToggleButton;
    private javax.swing.JToggleButton pic1ToggleButton;
    private javax.swing.JToggleButton pic2ToggleButton;
    private javax.swing.JToggleButton pic3Button;
    // End of variables declaration//GEN-END:variables
}
