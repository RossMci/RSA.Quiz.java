
package io.github.rossmci.rsaquiz;

import java.util.ResourceBundle;


public abstract class RsaQuizPanel extends javax.swing.JPanel
{
	public RsaQuizPanel()
	{
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames");
		initComponents();
	}
	public RsaQuizPanel(RsaQuizManger rsaQuizManger,UserData userData)
	{
		this();
		this.rsaQuizManger = rsaQuizManger;
		this.framesResourceBundle = ResourceBundle.getBundle("bundles/Frames", this.rsaQuizManger.getLocale());
		this.userData=userData;
	}

	public UserData getUserData()
	{
		return userData;
	}

	public void setUserData(UserData userData)
	{
		this.userData = userData;
	}
	
	//
	//	Properties
	//
	public RsaQuizManger getRsaQuizManger()
	{
		return rsaQuizManger;
	}
	public void setRsaQuizManger(RsaQuizManger rsaQuizManger)
	{
		this.rsaQuizManger = rsaQuizManger;
	}
	//
	//	Abstract Methods
	//
	public abstract void reloadLocaleResource();
	//
	//	Protected Fields
	//
	protected ResourceBundle framesResourceBundle;
	//
	//	Private Fields
	//
	private RsaQuizManger rsaQuizManger;
	
	private UserData userData;
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
